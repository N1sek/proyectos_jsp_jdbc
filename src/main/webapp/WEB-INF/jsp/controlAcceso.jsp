<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 12/12/24
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Acceso Permitido</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
              crossorigin="anonymous">

        <style>
            body {
                display: flex;
                justify-content: center;
                align-items: center;
            }
        </style>
    </head>
    <body>
        <body>
            <div class="container p-5 shadow bg-white rounded">
                <h1 class="text-center">Iniciar sesion</h1>
                <form method="get" action="PiramideServlet">
                    <p>Se ha permitido la entrada a la aplicacion</p>
                    <button type="submit" class="btn btn-primary btn-lg w-100 mt-2">Aceptar</button>
                </form>

            </div>
        </body>
</html>
