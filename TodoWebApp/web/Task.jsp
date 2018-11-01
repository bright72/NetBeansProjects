<%-- 
    Document   : Task
    Created on : Sep 20, 2018, 4:18:17 PM
    Author     : harit
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Task Page</title>
    </head>
    <body>
        <form action="TaskServlet" method="post">
            User : ${username}<br>
            New task : <input type="text" name="newtask"> <input type="submit"></form>
            <table>
                <thead>
                <th>Date<th>
                <th>Task<th>
                <th>status<th>
                    </thead>
                <c:forEach items="${task}" var="task">
            <tr>
                <td>${task.createdate}</td>
                <td>${task.task}</td>
                <td>${task.status}</td>
            </tr>
            </c:forEach>
            </table>
                </body>
                </html>
