<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%
    //회원인증정보 속성 삭제
    session.removeAttribute("UserId");
    session.removeAttribute("UserName");

    //모든 속성 한꺼번에 삭제
    session.invalidate();

    //속성 삭제 후 페이지 이동
    response.sendRedirect("LoginForm.jsp");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
