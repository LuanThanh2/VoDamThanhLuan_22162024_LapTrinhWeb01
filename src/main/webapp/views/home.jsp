<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      Trang chủ của user
      <!-- Nút logout -->
    <form action="${pageContext.request.contextPath}/logout" method="get">
        <button type="submit">Logout</button>
    </form>
</body>
</html>