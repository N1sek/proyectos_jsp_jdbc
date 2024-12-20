<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 12/12/24
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
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
            <h1 class="text-center">Iniciar sesion</h1>
            <form method="post" action="LoginServlet">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="username" name="username" placeholder="Usuario (admin)">
                    <label for="username">Nombre de usuario (admin)</label>
                </div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Clave secreta (admin)">
                    <label for="password">Contraseña (admin)</label>
                </div>
                <button type="submit" class="btn btn-primary btn-lg w-100 mt-2">Login</button>
            </form>

        </div>
    </body>
</html>
