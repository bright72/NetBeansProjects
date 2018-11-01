<%-- 
    Document   : History
    Created on : Oct 25, 2018, 1:48:26 PM
    Author     : harit
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>History Page</title>
    </head>
    <body>
        <h1>History Page</h1>
<!--        ${accountId}<br>--><br>
        <table>
            <th>
                <td>#</td>
                <td>TimeStamp</td>
                <td>Method</td>
                <td>Amount</td>
                <td>Balance</td>
                </th>
                <c:forEach items="${history}" var="h" varStatus="n">
                <tr>
                <td>${n.count}</td>
                <td>${n.timestamo}</td>
                <td>${h.method}</td>
                <td>${h.amount}</td>
                <td>${h.balance}</td>
                </tr>
                </c:forEach>
        </table>
        <a href="MyAccount.jsp" >Back</a>
    </body>
</html>
