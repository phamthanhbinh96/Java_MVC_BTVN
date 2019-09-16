<%-- 
    Document   : update
    Created on : Sep 17, 2019, 3:12:31 AM
    Author     : P.T.B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Update">
            ID: <input type="text" name="id" value="${student.id}"required="required" readonly="readonly" /><br/>
            Name: <input type="text" name="txtT" value="${student.name}" required="required"/><br/>
            YearOfBirth: <input type="text" name="txtTa" value="${student.yearOfBirth}"/><br/>
            Gender: <input type="text" name="txtG" value="${student.gender}"/><br/>
            AdmissionDate: <input type="text" name="txtG" value="${student.admissionDate}"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
