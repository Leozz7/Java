package com.streams.test;

import com.streams.dominio.Categoria;
import com.streams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors02 {
    private static List<LigthNovel> lm = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99, Categoria.FANTASIA),
            new LigthNovel("Overload", 2.99, Categoria.FANTASIA),
            new LigthNovel("Violet Evergarden", 5.99, Categoria.DRAMA),
            new LigthNovel("No Game", 2.99, Categoria.FANTASIA),
            new LigthNovel("Tensei Shittara", 8.99, Categoria.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Categoria, List<LigthNovel>> collect = lm.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategoria));

        System.out.println(collect);
    }
}
