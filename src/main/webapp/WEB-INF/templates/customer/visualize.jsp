<%-- 
    Document   : visualize
    Created on : Sep 8, 2019, 10:23:16 PM
    Author     : bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        ${customer.getId()}
        <br/>
        ${customer.getName()}
        <br/>
        ${customer.getLastName()}
        <br/>
        ${customer.getEmail()}
        <br/>
        ${customer.getBirthday()}
        <br/>
        ${customer.getCPF()}
        <br/>
        ${customer.getStreet()}
        <br/>
        ${customer.getNumber()}
        <br/>
        ${customer.getCity()}
        <br/>
        ${customer.getState()}
        <br/>
        ${customer.getLoan().getId()}
        <br/>
    </body>
</html>
