package com.streams.test;

import com.streams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors01 {
    private static List<LigthNovel> lm = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overload", 2.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No Game", 2.99),
            new LigthNovel("Tensei Shittara", 8.99)
    ));

    public static void main(String[] args) {
        System.out.println(lm.stream().count());
        System.out.println(lm.stream().collect(Collectors.counting()));

        lm.stream().max(Comparator.comparing(LigthNovel::getPreco))
                .ifPresent(System.out::println);

        lm.stream().collect(Collectors.maxBy(Comparator.comparing(LigthNovel::getPreco)))
                .ifPresent(System.out::println);

        DoubleSummaryStatistics collect = lm.stream().collect(Collectors.summarizingDouble(LigthNovel::getPreco));

        System.out.println(collect);

        String nomes = lm.stream()
                .map(LigthNovel::getNome)
                .collect(Collectors.joining(", "));

        System.out.println(nomes);

    }
}
