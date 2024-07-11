<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mi Calculadora</title>
</head>
<body>
    <h1>Mi Calculadora</h1>
    <form action="CalculateServlet" method="post">
        <label for="num1">Número 1:</label>
        <input type="text" id="num1" name="num1" required><br><br>
        <label for="num2">Número 2:</label>
        <input type="text" id="num2" name="num2" required><br><br>
        <label for="operation">Operación:</label>
        <select id="operation" name="operation">
            <option value="sum">Suma</option>
            <option value="subtract">Resta</option>
            <option value="multiply">Multiplicación</option>
            <option value="divide">División</option>
            <option value="sort">Ordenar</option>
            <option value="parity">Par o Impar</option>
        </select><br><br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
