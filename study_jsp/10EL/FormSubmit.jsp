<%--폼값 전송용 개인정보 입력폼--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>표현 언어(EL) - 폼값 처리</title>
</head>
<body>
    <h2>폼값 전송하기</h2>
    <form name="frm" method="post" action="FormResult.jsp">
        이름 : <input type="text" name="name"/><br/>
        성별 : <input type="radio" name="gender" value="Man"  />남자
              <input type="radio" name="gender" value="Woman"/>여자<br/>
        학력 :
            <select name="grade">
                <option value="ele">초등</option>
                <option value="mid">중등</option>
                <option value="high">고등</option>
                <option value="uni">대학생</option>
            </select><br/>
        관심 사항 :
        <!--EL로 폼값받을때 value 값으로 받음 -->
             <input type="checkbox" name="inter" value="pol" />정치
             <input type="checkbox" name="inter" value="eco" />경제
             <input type="checkbox" name="inter" value="ent" />연예
             <input type="checkbox" name="inter" value="spo" />운동<br/>
        <input type="submit" value="전송하기"/>
    </form>
</body>
</html>
