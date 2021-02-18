<%--
  Created by IntelliJ IDEA.
  User: yury
  Date: 03.02.2021
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main JSP</title>
</head>
<body>
    <h1>Начальная страница на JSP</h1>
    <% for (int i = 0; i< 5; i++) { %>
        <p>Запись № <%= i %></p>
    <% } %>
</body>
</html>
