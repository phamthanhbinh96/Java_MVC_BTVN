<%-- 
    Document   : new
    Created on : Sep 17, 2019, 3:12:50 AM
    Author     : P.T.B
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            span{
                color: red;
            }
        </style>
    </head>
    <body>
        <form action="AddNew">
            ID: <input type="text" name="id" value="${student.id}"required="required" /><br/>
            Name: <input type="text" name="txtT" value="${student.name}" required="required"/><br/>
            YearOfBirth: <input type="text" name="txtTa" value="${student.yearOfBirth}"required="required"/><br/>
            Gender: <input type="text" name="txtG" value="${student.gender}" required="required"/><br/>
            AdmissionDate: <input type="text" name="txtG" value="${student.admissionDate}" required="required"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
