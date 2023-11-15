<%@ page import="utils.JSFunction" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%
    if(session.getAttribute("UserId") == null){
        JSFunction.alertLocation("로그인 후 이용해 주십시오.",
                                 "../06Session/LoginForm.jsp", out);
        return;
    }
%>
