package com.streams.test;

import com.streams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test02 {
    private static List<LigthNovel> lm = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overload", 2.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No Game", 2.99),
            new LigthNovel("Tensei Shittara", 8.99)
    ));

    public static void main(String[] args) {
        lm.stream()
                .sorted(Comparator.comparing(LigthNovel::getPreco))
                .forEach(System.out::println);
    }
}
