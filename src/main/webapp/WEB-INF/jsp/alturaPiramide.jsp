<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 13/12/24
  Time: 0:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Altura de la piramide</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
              crossorigin="anonymous">

        <style>
            body{
                display: flex;
                justify-content: center;
                align-items: center;
            }
        </style>
    </head>
    <body>
        <div class="container p-5 shadow bg-white rounded">
            <h1 class="text-center">Pinta una piramide</h1>
            <form method="post" action="PiramideServlet">
                <div class="form-floating mb-3">
                    <input type="number" class="form-control" id="altura" name="altura" placeholder="Altura">
                    <label for="altura">Altura</label>
                </div>
                <button type="submit" class="btn btn-primary btn-lg w-100 mt-2">Aceptar</button>
            </form>
        </div>
    </body>
</html>
