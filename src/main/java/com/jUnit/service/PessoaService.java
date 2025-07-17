package com.jUnit.service;

import com.jUnit.dominio.Pessoa;

public class PessoaService {
    public static boolean verificadorIdade(Pessoa pessoa) {
        if (pessoa == null) {
            throw new IllegalArgumentException("Pessoa não pode ser nula");
        }
        return pessoa.getIdade() >= 18;
    }
}
