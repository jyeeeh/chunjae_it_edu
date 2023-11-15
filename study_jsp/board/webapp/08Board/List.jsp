<%@ page import="model1.board.BoardDAO" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="model1.board.BoardDTO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%
    //DAO 생성해 DB연결
    BoardDAO dao = new BoardDAO(application);

    //사용자가 입력한 검색 조건을 Map에 저장
    Map<String, Object> param = new HashMap<String, Object>();

    String searchField = request.getParameter("searchField");
    String searchWord = request.getParameter("searchWord");
    if(searchWord != null) {
        param.put("searchField", searchField);
        param.put("searchWord", searchWord);
    }

    //게시물 수 확인
    int totalCount = dao.selectCount(param);
    //게시물 목록 받기
    List<BoardDTO> boardLists = dao.selectList(param);
    dao.close(); // DB연결 닫기
%>
<html>
<head>
    <title>회원제 게시판</title>
</head>
<body>
    <!--공통 링크-->
    <jsp:include page="../Common/Link.jsp" />
    <h2>목록 보기(List)</h2>
    <!--검색폼-->
    <form method="get">
    <table style="border: 1px solid; width: 90%;">
        <tr>
            <td style="text-align: center;">
                <select name="searchField">
                    <option value="title">제목</option>
                    <option value="content">내용</option>
                </select>
                <input type="text" name="searchWord" />
                <input type="submit" value="검색하기" />
            </td>
        </tr>
    </table>
    </form>

    <!--게시물 목록 테이블(표)-->
    <table style="border: 1px solid; width: 90%;">
        <tr>
            <th style="width: 10%;">번호</th>
            <th style="width: 50%;">제목</th>
            <th style="width: 15%;">작성자</th>
            <th style="width: 10%;">조회수</th>
            <th style="width: 15%;">작성일</th>
        </tr>

        <!--목록의 내용-->
        <%
            //게시물이 하나도 없을 때
            if (boardLists.isEmpty()){
        %>

        <tr>
            <td colspan="5" style="text-align: center;">
                등록된 게시물이 없습니다.
            </td>
        </tr>

        <%
                //게시물이 있을 때
            } else {
                //화면상에서의 게시물 번호
                int virtualNum=0;
                for(BoardDTO dto : boardLists)
                {
                    virtualNum = totalCount --;
        %>
            <tr style="text-align: center;">
                <td><%= virtualNum %></td>
                <td style="text-align: left;">
                    <a href="View.jsp?num=<%= dto.getNum()%>"><%= dto.getTitle()%></a>
                </td>
                <td style="text-align: center;"><%= dto.getId()%></td>   <!--작성자 아이디-->
                <td style="text-align: center;"><%= dto.getVisitcount()%></td> <!--조회수-->
                <td style="text-align: center;"><%= dto.getPostdate()%></td> <!--작성일-->
            </tr>
        <%
            }
        }
        %>
    </table>

    <!--목록 하단의 [글쓰기] 버튼-->
    <table style="border: 1px solid; width: 90%;">
        <tr style="text-align: right;">
            <td><button type="button" onclick="location.href='Write.jsp';">글쓰기 </button></td>
        </tr>
    </table>
</body>
</html>
