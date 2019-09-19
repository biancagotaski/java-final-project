<%-- 
    Document   : index
    Created on : Aug 21, 2019, 7:19:53 PM
    Author     : Bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/template/header" />
        <table border>
            <tr><th>Sistema Operacional</th><th>Número de Núcleos</th><th>Possui Acessórios</th><th>Nome do Produto</th><th>Preço</th><th>Número de Série</th><th>Marca</th></tr>
            <c:forEach items="${computers}" var="computer">
                <tr>
                    <td>${computer.getOperationalSystem()}</td>
                    <td>${computer.getCores()}</td>
                    <td>${computer.isHasAccessories()}</td>
                    <td>${computer.getName()}</td>
                    <td>${computer.getValue()}</td>
                    <td>${computer.getSerialNumber()}</td>
                    <td>${computer.getBrand()}</td>
                    <td>
                        <a href="/computer/update/${computer.getId()}">Alterar</a>
                        &nbsp;
                        <a href="#" onclick="remove('Deseja Remover?', 'computer/remove/${computer.getId()}')">Remover</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
<c:import url="/template/footer" />
