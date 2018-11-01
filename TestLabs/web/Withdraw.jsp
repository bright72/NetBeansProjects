<%-- 
    Document   : Withdraw
    Created on : Oct 25, 2018, 1:46:03 PM
    Author     : harit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Withdraw Page</h1>
        <!--        ${accountId}<br>-->
<!--        balanch ${balance}<br>-->
       <form action="WithdrawServlet" method="post">
       <input type="text" name="withdraw"><br>
       <input type="submit">       
       </form>
       <a href="MyAccount.jsp" >Back</a>
    </body>
</html>
