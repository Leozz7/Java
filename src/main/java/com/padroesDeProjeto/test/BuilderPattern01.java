package com.padroesDeProjeto.test;

import com.padroesDeProjeto.dominio.Pessoa;

public class BuilderPattern01 {
    public static void main(String[] args) {
        System.out.println(new Pessoa.PessoaBuilder()
                .nome("Leandro")
                .sobrenome("Sena")
                .username("Leozz")
                .email("leoz@gmail.com")
                .build());
    }
}
