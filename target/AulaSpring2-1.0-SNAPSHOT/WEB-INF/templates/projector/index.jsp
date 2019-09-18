<%-- 
    Document   : index
    Created on : Sep 17, 2019, 6:44:10 PM
    Author     : bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/template/header" />

    <table border>
        <tr><th>Id</th><th>Resolução em Pixels</th><th>Possui LCD?</th><th>Possui Laser?</th></tr>
        <c:forEach items="${projectors}" var="projector">
            <tr>
                <td>${projector.getId()}</td>
                <td>${projector.getResolution()}</td>
                <td>${projector.isHasLCD()}</td>
                <td>${projector.isHasLaser()}</td>
            </tr>
        </c:forEach>
    </table>

<c:import url="/template/footer" />
