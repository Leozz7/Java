package com.crud.validations;

import com.crud.model.Producer;

import java.util.List;

public class Validacoes {
    public static <T> List<T> isEmpity(List<T> p) {
        if (p.isEmpty()) {
            throw new IllegalArgumentException("A lista esta vazia");
        }
        return p;
    }
}
