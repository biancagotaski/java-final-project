<%-- 
    Document   : visualization
    Created on : Aug 24, 2019, 12:39:46 PM
    Author     : Bianca
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
        ${computer.getOperationalSystem()}
        <br />
        ${computer.getCores()}
        <br />
        Possui acessórios: ${computer.isHasAccessories()}
    </body>
</html>
