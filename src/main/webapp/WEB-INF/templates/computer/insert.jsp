<%-- 
    Document   : insert
    Created on : Aug 21, 2019, 7:20:11 PM
    Author     : Bianca
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<c:import url="/template/header" />
        <h1>Registrar Computador</h1>
        <form:form action="computer/insertAction/" method="post" modelAttribute="computer">
            <fieldset>
                <label>Sistema Operacional:</label>
                <form:input path="operationalSystem"/>
                <label>Núcleos:</label>
                <form:input path="cores"/>
                <label>Possui Acessórios:</label>
                <form:checkbox path="hasAccessories"/>
            </fieldset>
        </form:form>
<c:import url="/template/footer" />
