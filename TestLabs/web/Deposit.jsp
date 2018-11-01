<%-- 
    Document   : Deposit
    Created on : Oct 25, 2018, 1:20:49 PM
    Author     : harit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
       <h1>Deposit Page</h1><br>
<!--        ${accountId}<br>-->
<!--        balanch ${balance}<br>-->
       <form action="DepositServlet" method="post">
       <input type="text" name="deposit"><br>
       <input type="submit">       
       </form>
       <a href="MyAccount.jsp" >Back</a>
    </body>
</html>
