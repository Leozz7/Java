package com.streams.test;

import com.streams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test01 {
    public static void main(String[] args) {
        List<LigthNovel> lm = new ArrayList<>(List.of(
                new LigthNovel("Tensei Shittara", 8.99),
                new LigthNovel("Overload", 3.99),
                new LigthNovel("Violet Evergarden", 5.99),
                new LigthNovel("No Game", 2.99),
                new LigthNovel("Tensei Shittara", 8.99)
        ));



        System.out.println(lm.stream()
                .sorted(Comparator.comparing(LigthNovel::getNome))
                .map(LigthNovel::getNome)
                .limit(3)
                .toList());
    }
}
