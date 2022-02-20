package com.example.santander.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClienteModel {
    private String nome;
    private String email;
    private ContaModel conta;
}
