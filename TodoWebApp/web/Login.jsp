<%-- 
    Document   : Login
    Created on : Sep 20, 2018, 4:02:40 PM
    Author     : harit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body style="color: red">
        <form action="LoginServlet" method="post">
       Username : <input type="text" name="username" required><br>
       Password : <input type="password" name="password" required><br>
       <input type="submit" value="login">
        <br>
        ${message}
    </form>
        </body>
</html>
