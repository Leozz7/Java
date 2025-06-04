package com.streams.test;

import com.streams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;

public class test07 {
    private static List<LigthNovel> lm = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overload", 2.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No Game", 2.99),
            new LigthNovel("Tensei Shittara", 8.99)
    ));

    public static void main(String[] args) {
        System.out.println(lm.stream()
                .anyMatch(ligthNovel -> ligthNovel.getPreco() > 8));

        System.out.println(lm.stream()
                .allMatch(ligthNovel -> ligthNovel.getPreco() > 0));

        System.out.println(lm.stream()
                .noneMatch(ligthNovel -> ligthNovel.getPreco() > 0));

        lm.stream()
                .filter(ligthNovel -> ligthNovel.getPreco() > 3)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
