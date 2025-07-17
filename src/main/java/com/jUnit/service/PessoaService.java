package com.jUnit.service;

import com.jUnit.dominio.Pessoa;

import java.util.List;

public class PessoaService {
    public static boolean verificadorIdade(Pessoa pessoa) {
        if (pessoa == null) {
            throw new IllegalArgumentException("Pessoa não pode ser nula");
        }
        return pessoa.getIdade() >= 18;
    }

    public static List<Pessoa> filtroRemoveNaoAdultos(List<Pessoa> pessoa) {
        return pessoa.stream().filter(PessoaService::verificadorIdade).toList();
    }
}
