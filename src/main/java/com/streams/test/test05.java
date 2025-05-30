package com.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test05 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Goku", "Vegeta", "Temper","Morga");

        for (String n : nomes) {
            String[] letras = n.split("");
            System.out.println(Arrays.toString(letras));
        }

        List<String> letras2 = nomes.stream()
                .map(l -> l.split(""))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(letras2);

    }
}