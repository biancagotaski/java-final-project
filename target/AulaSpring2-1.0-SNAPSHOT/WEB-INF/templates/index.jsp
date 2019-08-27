<%-- 
    Document   : index
    Created on : Aug 15, 2019, 6:47:55 PM
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Logar!</h1>
        
        <h2>${message}</h2>
        
        <form method="post" action="${pageContext.request.contextPath}/user/login">
            <label>User</label>
            <input name="username"/>
            <label>Password</label>
            <input type="password" name="password"/>
            <input type="submit" value="Loggin"/>
        </form>
    </body>
</html>
