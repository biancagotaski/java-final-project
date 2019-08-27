<%-- 
    Document   : successful
    Created on : Aug 20, 2019, 5:30:23 PM
    Author     : Bianca
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem vindo</title>
    </head>
    <body>
        <% //String namePath = ${pageContext.request.contextPath}%>
        <h1>Bem vindo ${sessionScope.username}</h1>
    </body>
</html>
