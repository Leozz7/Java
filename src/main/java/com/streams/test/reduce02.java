package com.streams.test;

import com.streams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;

public class reduce02 {
    private static List<LigthNovel> lm = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overload", 2.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No Game", 2.99),
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        lm.stream()
                .map(LigthNovel::getPreco)
                .filter(preco -> preco > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        lm.stream()
                .mapToDouble(LigthNovel::getPreco)
                .filter(preco -> preco > 3)
                .sum();

    }
}
