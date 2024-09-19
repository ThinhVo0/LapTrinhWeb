<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/9/2024
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:if test="${msg == true}">Xin chào ${username}</c:if>
  <c:if test="${msg == false}">Cook ${username}</c:if>
</body>
</html>
