<%--
  Created by IntelliJ IDEA.
  User: TuoiTho
  Date: 2024-09-15
  Time: 01:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1>ADMIN</h1>
    <form action="${pageContext.request.contextPath}/logout" method="get">
        <button type="submit" class="btn btn-primary">Logout</button>
    </form>
</div>
</body>
</html>