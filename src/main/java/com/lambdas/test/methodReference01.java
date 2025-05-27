package com.lambdas.test;

import com.lambdas.dominio.Filme;

import java.util.*;

public class methodReference01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>(List.of(new Filme("Uma sexta feira em Apuros", 6),new Filme("Abecedario", 8) ,new Filme("Homem Aranha", 2), new Filme("Homem de Ferro", 9)));
        filmes.sort((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()));
        System.out.println(filmes);
    }
}
