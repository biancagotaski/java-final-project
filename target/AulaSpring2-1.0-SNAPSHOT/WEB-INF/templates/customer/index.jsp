<%-- 
    Document   : index
    Created on : Aug 21, 2019, 7:19:53 PM
    Author     : Bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/template/header" />
    
    <script>
        function remove(message, url){
            if(confirm(message)){
                window.location = url;
            }
        }    
    </script>

    <a href="/customer/insert">Inserir novo cliente</a>

    <table border>
        <tr><th>Id</th><th>Nome</th><th>Sobrenome</th><th>E-mail</th><th>Data de Nascimento</th><th>CPF</th><th>Logradouro</th><th>Número</th><th>Cidade</th><th>Estado</th><th>Empréstimos</th></tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>${customer.getId()}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getLastName()}</td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getBirthday()}</td>
                <td>${customer.getCPF()}</td>
                <td>${customer.getStreet()}</td>
                <td>${customer.getNumber()}</td>
                <td>${customer.getCity()}</td>
                <td>${customer.getState()}</td>
                <td>${(customer.getLoan() != null) ? customer.getLoan().getId() : "-"}</td>
                <td>
                    <a href="/customer/update/${customer.getId()}">Alterar</a>
                    &nbsp;
                    <a href="#" onclick="remove('Deseja Remover?', '${pageContext.request.contextPath}/customer/remove/${customer.getId()}')">Remover</a>
                </td>
            </tr>
        </c:forEach>
    </table>
<c:import url="/template/footer" /> 
