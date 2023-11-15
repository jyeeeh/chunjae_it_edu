<%--전송된 폼값 확인용 페이지--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>표현 언어(EL) - 폼값 처리</title>
</head>
<body>
    <h3>EL로 폼값 받기</h3>
    <ul>
        <!--값이 하나만 전송되므로 EL내장객체인 param으로 값을 받을 수 있음-->
        <li>이름 : ${param.name}</li>
        <li>성별 : ${param.gender}</li>
        <li>학력 : ${param.grade}</li>
        <!--다수의 값을 전송할 수 있으므로 paramValues를 통해 배열로 값을 받음-->
        <!--input의 name(inter)으로 받음-->
        <li>관심사항 : ${paramValues.inter[0]}
                      ${paramValues.inter[1]}
                      ${paramValues.inter[2]}
                      ${paramValues.inter[3]}
        </li>
    </ul>
</body>
</html>
