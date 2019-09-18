<%-- 
    Document   : insert
    Created on : Sep 8, 2019, 10:08:53 PM
    Author     : bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/template/header" />
    <h1>Cadastrar Cliente</h1>
    <form:form action="/customer/insertAction" method="post" modelAttribute="customer">
        <fieldset>
            <legend>Dados Cliente:</legend>
            
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

        <form:button>Cadastrar</form:button>
    </form:form>
<c:import url="/template/footer" />
