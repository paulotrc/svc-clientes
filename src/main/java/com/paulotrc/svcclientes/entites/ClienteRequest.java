package com.paulotrc.svcclientes.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ClienteRequest {

    private Integer id;
    private String nome;
    private long cpf;
    private long telefone;
}

