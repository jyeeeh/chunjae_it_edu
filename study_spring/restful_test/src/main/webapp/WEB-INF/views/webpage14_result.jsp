<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RESTful 웹 서비스</title>
</head>
<body>
    <h3>RESTful 웹 서비스</h3>
    <p><% out.print(new java.util.Date()); %></p>
    <!-- Controller 에 있는 attributeName 과 동일하게 -->
    <p>${title}</p>
    <p>${result}</p>
</body>
</html>
