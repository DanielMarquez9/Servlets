<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
    <h1>Resultado</h1>
    <p><%= request.getAttribute("result") %></p>
    <a href="index.jsp">Volver</a>
</body>
</html>
