package com.calculadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateServlet")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            String operation = request.getParameter("operation");
            String result = "";

            switch (operation) {
                case "sum":
                    result = "Resultado: " + (num1 + num2);
                    break;
                case "subtract":
                    result = "Resultado: " + (num1 - num2);
                    break;
                case "multiply":
                    result = "Resultado: " + (num1 * num2);
                    break;
                case "divide":
                    result = num2 != 0 ? "Resultado: " + ((double)num1 / num2) : "Error: División por cero no permitida.";
                    break;
                case "sort":
                    result = "Números ordenados: " + Math.min(num1, num2) + ", " + Math.max(num1, num2);
                    break;
                case "parity":
                    result = "Número " + num1 + " es " + (num1 % 2 == 0 ? "par" : "impar") + " y número " + num2 + " es " + (num2 % 2 == 0 ? "par" : "impar");
                    break;
                default:
                    result = "Operación no válida.";
            }
            request.setAttribute("result", result);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            response.sendRedirect("error.jsp");
        }
    }
}

