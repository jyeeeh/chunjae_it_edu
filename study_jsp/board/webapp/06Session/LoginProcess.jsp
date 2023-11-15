<%@ page import="membership.MemberDAO" %>
<%@ page import="membership.MemberDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>

<%
    String userId = request.getParameter("user_id");
    String userPwd = request.getParameter("user_pw");

    String mariaDBDriver = application.getInitParameter("mariaDBDriver");
    String mariaDBURL = application.getInitParameter("mariaDBURL");
    String mariaDBId = application.getInitParameter("mariaDBId");
    String mariaDBPwd = application.getInitParameter("mariaDBPwd");

    MemberDAO dao = new MemberDAO(mariaDBDriver,mariaDBURL,mariaDBId,mariaDBPwd);
    MemberDTO memberDTO = dao.getMemberDTO(userId,userPwd);
    dao.close();

    if(memberDTO.getId()!=null){
        session.setAttribute("UserId", memberDTO.getId());
        session.setAttribute("UserName", memberDTO.getName());
        response.sendRedirect("LoginForm.jsp");
    }
    else {
        request.setAttribute("LoginErrMsg","로그인 오류입니다.");
        request.getRequestDispatcher("LoginForm.jsp").forward(request,response);
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
