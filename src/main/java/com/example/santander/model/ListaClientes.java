package com.example.santander.model;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private static List<ClienteModel> listaDeCliente = new ArrayList<>();

    public void adicionar(ClienteModel cliente) {
        listaDeCliente.add(cliente);
    }

    public List<ClienteModel> listar() {
        return ListaClientes.listaDeCliente;
    }}
