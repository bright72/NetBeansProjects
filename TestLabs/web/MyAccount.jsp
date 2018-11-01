<%-- 
    Document   : MyAccount
    Created on : Oct 25, 2018, 1:05:42 PM
    Author     : harit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MyAccount Page</title>
    </head>
    <body>
        <h1>MyAccount Page</h1><br>
        ${account.name}<br>
        balanch ${account.balance}<br>
        <a href="Deposit.jsp" >Deposit</a><br>
        <a href="Withdraw.jsp" >Withdraw</a><br>
        <a href="History.jsp" >History</a><br><br>
        
        <a href="login.jsp" >Login</a>

    </body>
</html>
