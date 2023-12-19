<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Tag</title>
</head>
<body>
    <h3>회원정보</h3>
    <p>아이디 : ${member.id}
    <p>비밀번호 : ${member.password}
    <p>거주지 : ${member.city}
    <p>성 별 : ${member.sex}
    <p>취 미 : <c:forEach items="${member.hobby}" var="hobby">
        [<c:out value="${hobby}"/>]
        </c:forEach>

</body>
</html>
