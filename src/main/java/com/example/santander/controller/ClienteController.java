package com.example.santander.controller;


import com.example.santander.model.ClienteModel;
import com.example.santander.model.ContaModel;
import com.example.santander.model.ListaClientes;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClienteController", value = "/ClienteController")
public class ClienteController extends HttpServlet {
    ListaClientes listaClientes = new ListaClientes();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ClienteModel> listarClientes = listaClientes.listar();
        request.setAttribute("listarClientes", listarClientes);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listarClientes.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeCliente = request.getParameter("nomeCliente");
        String emailCliente = request.getParameter("emailCliente");
        String agenciaContaCliente = request.getParameter("agenciaConta");
        String numeroContaCliente = request.getParameter("numeroConta");

        ClienteModel novoCliente = new ClienteModel(nomeCliente,emailCliente,new ContaModel(Integer.parseInt(agenciaContaCliente),Integer.parseInt(numeroContaCliente)));

        listaClientes.adicionar(novoCliente);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("mensagemCadastro.jsp");
        request.setAttribute("nomeCliente", novoCliente.getNome());

        requestDispatcher.forward(request, response);

    }
}
