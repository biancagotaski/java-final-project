<%-- 
    Document   : register
    Created on : Aug 15, 2019, 6:53:48 PM
    Author     : Bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/template/header" />

    <table border>
        <tr><th>Id</th><th>Data de Início</th><th>Data Final</th><th>CPF do Cliente</th><th>Identificação do Cliente</th><th>Identificação do Produto</th></tr>
        <c:forEach items="${loans}" var="loan">
            <tr>
                <td>${loan.getId()}</td>
                <td>${loan.getStartDate()}</td>
                <td>${loan.getEndDate()}</td>
                <td>${loan.getCpfCustomer()}</td>
                <!-- INSERIR OS CAMPOS QUE POSSUEM RELACIONAMENTO -->
            </tr>
        </c:forEach>
    </table>

<c:import url="/template/footer" />
