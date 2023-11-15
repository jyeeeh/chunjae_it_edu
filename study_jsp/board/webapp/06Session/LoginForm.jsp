<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Session</title>
</head>
<body>
    <jsp:include page="../Common/Link.jsp" />
<h2>로그인 페이지</h2>
<!--LoginErrMsg 속성이 있는지 확인 후 내용 출력-->
<span style="color: red; font-size:1.2em;">
        <%= request.getAttribute("LoginErrMsg")==null ?
                "" : request.getAttribute("LoginErrMsg") %>
    </span>

<%
    if(session.getAttribute("UserId")==null){
        //로그아웃 상태
%>
<script>
    //validateForm() 아이디와 패스워드 중 빈 값이 있으면 경고창 띄움
    function validateForm(form){
        if(!form.user_id.value){
            alert("아이디를 입력하세요.");
            return false;
        }
        if(form.user_pw.value==""){
            alert("패스워드를 입력하세요.");
            return false;
        }
    }
</script>

<!--폼값 전송 시 onsubmit 이벤트핸들러가 validateForm() 호출-->
<form action ="LoginProcess.jsp" method="post" name="loginFrm"
      onsubmit="return validateForm(this);">
    아이디 : <input type="text" name="user_id" /><br />
    패스워드 : <input type="password" name="user_pw" /><br/>
    <input type="submit" value="로그인하기"/>
</form>
<%
} else { //로그인된 상태
%>
<%= session.getAttribute("UserName")%> 회원님, 로그인하셨습니다.<br/>
<a href="Logout.jsp">[로그아웃]</a>
<% } %>
</body>
</html>
