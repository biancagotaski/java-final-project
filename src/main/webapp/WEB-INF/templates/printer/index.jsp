<%-- 
    Document   : index
    Created on : Sep 17, 2019, 6:44:42 PM
    Author     : bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/template/header" />

    <table border>
        <tr><th>Id</th><th>Possui Laser?</th><th>Quantidade máxima de folhas</th><th>Possui Wi-Fi?</th><th>Nome do Produto</th><th>Preço</th><th>Número de Série</th><th>Marca</th></tr>
        <c:forEach items="${printers}" var="printer">
            <tr>
                <td>${printer.getId()}</td>
                <td>${printer.isIsLaser()}</td>
                <td>${printer.getMaxLeaf()}</td>
                <td>${printer.isHasWifi()}</td>
                <td>${printer.getName()}</td>
                <td>${printer.getValue()}</td>
                <td>${printer.getSerialNumber()}</td>
                <td>${printer.getBrand()}</td>
            </tr>
        </c:forEach>
    </table>

<c:import url="/template/footer" />