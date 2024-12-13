<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 13/12/24
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Piramide Michis</title>
        <style>
            .michi-row {
                display: flex;
                justify-content: center;
            }
            .cat-row img {
                margin: 2px;
            }
        </style>
    </head>
    <body>
        <%
            int altura = (int) request.getAttribute("altura");

            for (int i = 1; i <= altura; i++){
                out.println("<div class='michi-row'>");
                for (int j = 1; j <= i; j++){
                    out.println("<img src='img/michi.png' width='50' height='50' alt='Michi'></img>");
                }
                out.println("</div>");
            }
        %>
    </body>
</html>
