package com.streams.test;

import com.streams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test03 {
    private static List<LigthNovel> lm = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overload", 2.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No Game", 2.99),
            new LigthNovel("Tensei Shittara", 8.99)
    ));

    public static void main(String[] args) {
        lm.stream()
                .map(LigthNovel::getNome)
                .forEach(System.out::println);

        long count = lm.stream()
                .filter(lm -> lm.getPreco() < 5)
                .count();

        lm.stream().
                distinct()
                .filter(lm -> lm.getPreco() < 4);

        System.out.println(count);
    }
}
