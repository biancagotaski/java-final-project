<%-- 
    Document   : insert
    Created on : Aug 20, 2019, 7:10:23 PM
    Author     : Bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empréstimo</title>
    </head>
    <body>
        <h1>Registrar Empréstimo</h1>
        <form:form action="loan/insertAction/" method="post" modelAttribute="loan">
            <label>CPF do Cliente:</label>
            <form:input path="cpfCustomer"/>
            <label>Produto:</label>
            <form:input path="product"/>
            <label>Data de Entrada:</label>
            <form:input path="startDate"/>
            <label>Data de finalização do empréstimo:</label>
            <form:input path="endDate"/>
        </form:form>
    </body>
</html>
