package com.crud.validations;

import com.crud.model.Producer;

import java.util.List;

public class Validacoes {
    public static List<Producer> isEmpity(List<Producer> p) {
        if (p.isEmpty()) {
            throw new RuntimeException("A lista esta vazia");
        }
        return p;
    }
}
