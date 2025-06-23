package com.jdbc.validacoes;

import com.jdbc.model.Producer;

import java.util.List;

public class Validacoes {
    public static List<Producer> verificarLista(List<Producer> p) {
        if (p.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia");
        }
        return p;
    }

    public static void validacaoID(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("O id esta incorreto");
        }
    }
}
