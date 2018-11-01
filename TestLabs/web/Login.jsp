<%-- 
    Document   : Login
    Created on : Oct 25, 2018, 1:20:00 PM
    Author     : harit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Login</div><br>
        <form action="LoginServlet" method="post">
            Account ID <input type="number" name="id" required><br>
            PIN <input type="number" name="pin" required><br>
            ${message}<br>
            <input type="submit"><br>
            </form>
    </body>
</html>
