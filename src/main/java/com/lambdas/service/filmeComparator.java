package com.lambdas.service;

import com.lambdas.dominio.Filme;

public class filmeComparator {
    public int comparByNome(Filme f1, Filme f2) {
        return f1.getNome().compareToIgnoreCase(f2.getNome());
    }
}
