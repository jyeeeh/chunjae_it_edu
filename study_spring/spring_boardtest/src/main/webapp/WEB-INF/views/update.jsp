<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update.jsp</title>
</head>
<body>
<form action="/board/update" method="post" name="updateForm">
    <input type="hidden" name="id" value="${board.id}" readonly><br><br>
    <input type="text" name="boardWriter" value="${board.boardWriter}" readonly><br><br>
    <input type="text" name="boardPass" id="boardPass" placeholder="비밀번호" autofocus><br><br>
    <input type="text" name="boardTitle" value="${board.boardTitle}"><br><br>
    <textarea name="boardContents" cols="30" rows="10">${board.boardContents}</textarea><br><br>
    <input type="button" value="수정" onclick="updateReqFn()">
    <!--button 사용 이유 : 유효성 검사를 위해
        form-submit 은 유효성 검사가 되질 않음-->
</form>
</div>
</body>
<script>
    const updateReqFn = () => {
        const passInput = document.getElementById("boardPass").value;
        const passDB = '${board.boardPass}';
        if (passInput == passDB) {
            document.updateForm.submit();
        } else {
            alert("비밀번호가 일치하지 않습니다!!");
        }
    }
</script>
</html>