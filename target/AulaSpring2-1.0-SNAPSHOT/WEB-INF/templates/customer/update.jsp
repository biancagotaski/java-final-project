<%-- 
    Document   : update
    Created on : Sep 17, 2019, 9:30:10 PM
    Author     : bianca
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="/template/header" />
        <h1>Atualizar Dados de Cliente</h1>
        <form:form action="/customer/updateAction" method="post" modelAttribute="customer">
            <form:hidden path="id" />
            <fieldset>
                <legend>Dados do Cliente:</legend>
                <label>Nome:</label>
                <form:input path="name" />
                <label>Sobrenome:</label>
                <form:input path="lastName" />
                <label>E-mail:</label>
                <form:input path="email" />
                <label>Data de Nascimento:</label>
                <form:input path="birthday" placeholder="Insira no formato dd-mm-yyyy" />
                <label>CPF:</label>
                <form:input path="CPF" />
                <label>Logradouro:</label>
                <form:input path="street" />
                <label>Número:</label>
                <form:input path="number" />
                <label>Cidade:</label>
                <form:input path="city" />
                <label>Estado:</label>
                <form:input path="state" />
            </fieldset>
            <fieldset>
                <legend>Dados de Empréstimo</legend>
                <label>Data de Aquisição:</label>
                <form:input path="loan.startDate" placeholder="Insira no formato dd-mm-yyyy" />
                <label>Data de término:</label>
                <form:input path="loan.endDate" placeholder="Insira no formato dd-mm-yyyy" />
                <label>CPF do cliente:</label>
                <form:input path="loan.cpfCustomer" />
            </fieldset>
            
            <form:button>Alterar</form:button>
        </form:form>
<c:import url="/template/footer" />    