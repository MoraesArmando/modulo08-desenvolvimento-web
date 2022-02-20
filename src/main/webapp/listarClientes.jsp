<%@ page import="com.example.santander.model.ClienteModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Armando M
  Date: 20/02/2022
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Clientes</title>
</head>
<body>
<h1> Lista de Clientes</h1>
<table >
    <tr>
        <th>Nome</th>
        <th>Email</th>
        <th>Agência</th>
        <th>Conta</th>
    </tr>
    <%
        List<ClienteModel> clientes = (List) request.getAttribute("listarClientes");
        for (ClienteModel clienteModel : clientes) {
    %>
    <tr style="text-align: center">
        <td><%= clienteModel.getNome()%>
        </td>
        <td><%= clienteModel.getEmail()%>
        </td>
        <td><%= clienteModel.getConta().getAgencia()%>
        </td>
        <td><%= clienteModel.getConta().getNumero()%>
        </td>
    </tr>
    <%
        }
    %>
    <tfoot>
    <tr>
        <td>
            <a href="/santander">Voltar a Home</a>
        </td>
        <td>
            <a href="formCadastroCliente.html">Cadastrar novo Cliente</a>
        </td>
    </tr>
    </tfoot>
</table>
</body>
</html>
