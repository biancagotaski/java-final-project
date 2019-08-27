<%-- 
    Document   : insert
    Created on : Aug 21, 2019, 7:20:11 PM
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Computador Page</title>
    </head>
    <body>
        <h1>Registrar Computador</h1>
        <form:form action="computer/insertAction/" method="post" modelAttribute="computer">
            <label>Sistema Operacional:</label
            <form:input path="operationalSystem"/>
            <label>Núcleos:</label>
            <form:input path="cores"/>
            <label>Possui Acessórios:</label>
            <form:checkbox path="hasAccessories"/>
        </form:form>
    </body>
</html>
