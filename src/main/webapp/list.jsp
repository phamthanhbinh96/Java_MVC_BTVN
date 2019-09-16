<%-- 
    Document   : list
    Created on : Sep 17, 2019, 3:11:39 AM
    Author     : P.T.B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            tr{
                margin: auto;
                padding: auto;
            }
        </style>
    </head>
    <body>
         <a href="new.jsp">New Student</a>
        <form action="FindByName">
            StudentName: <input type="text" name="name"/><input type="submit" value="Seach"/>
        </form>
        <c:if test="${empty students}">
            <h1>No data</h1>
        </c:if>
        <c:if test="${not empty students}">
            <form action="ViewAll">
                <table>
                <tr>
                    <th>Id</th>
                    <th>StudentName</th>
                    <th>YearOfBirth</th>
                    <th>Gennder</th>
                    <th>AdmissionDate</th>
                </tr>
                <c:forEach items="${students}" var="std">
                    <tr>
                        <%--<td>${bo.getIsbn -- nhung dung $ nen bo get va cho ky tu dau tien lower}</td>--%>
                        <td>${std.id}</td>
                        <td>${std.name}</td>
                        <td>${std.yearOfBirth}</td>
                        <td>${std.gender}</td>
                        <td>${std.admissionDate}</td>
                        <td>
                            <a href="Delete?id=${std.id}">Delete</a>
                        </td>
                        <td>
                            <a href="Update?bookId=${std.id}">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            </form>
            
        </c:if>
    </body>
</html>
