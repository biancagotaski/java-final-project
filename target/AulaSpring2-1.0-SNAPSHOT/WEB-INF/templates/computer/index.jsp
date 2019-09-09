<%-- 
    Document   : index
    Created on : Aug 21, 2019, 7:19:53 PM
    Author     : Bianca
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border>
            <tr><th>Sistema Operacional</th><th>Número de Núcleos</th><th>Possui Acessórios</th><th>Veículos</th><th>Ações</th></tr>
            <c:forEach items="${computers}" var="computer">
                <tr>
                    <td>${computer.getNome()}</td>
                    <td>${computer.getIdade()}</td>
                    <td>
                        ${(computer.getHabilitacao() != null)
                          ? computer.getHabilitacao().getNumero()
                          : "-"
                        }
                    </td>
                    <td>
                        <a href="/veiculo/porProprietario/${pessoa.getId()}">Veículos</a>
                    </td>
                    <td>
                        <a href="/computer/update/${computer.getId()}">Alterar</a>
                        &nbsp;
                        <a href="#" onclick="remove('Deseja Remover?', 'computer/remove/${computer.getId()}')">Remover</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
