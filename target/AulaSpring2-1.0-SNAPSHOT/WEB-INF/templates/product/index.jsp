<%-- 
    Document   : index
    Created on : Sep 17, 2019, 6:19:28 PM
    Author     : bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/template/header" />
    <a href="/product/insert">Inserir novo produto</a>
    
    <table border>
        <tr><th>Id</th><th>Nome</th><th>Preço</th><th>Número Serial</th><th>Marca</th><th>Empréstimos</th></tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getName()}</td>
                <td>${product.getValue()}</td>
                <td>${product.getSerialNumber()}</td>
                <td>${product.getBrand()}</td>
                <!-- INSERIR OS CAMPOS QUE POSSUEM RELACIONAMENTO -->
                
                <td>
                    <a href="/product/update/${product.getId()}">Alterar</a>
                    &nbsp;
                    <a href="#" onclick="remover('Deseja Remover?', 'product/remove/${product.getId()}')">Remover</a>
                </td>
            </tr>
        </c:forEach>
    </table>
<c:import url="/template/footer" /> 
