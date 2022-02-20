
<%--
  Created by IntelliJ IDEA.
  User: Armando M
  Date: 20/02/2022
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String nomeCliente = (String)request.getAttribute("nomeCliente");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Cadastro efetuado com SUCESSO!</h1>
    <h3> Cliente <%= nomeCliente %></h3>
    <a href="formCadastroCliente.html">Cadastrar cliente</a>
    <a href="ClienteController">Listar Clientes</a>
</body>
</html>
