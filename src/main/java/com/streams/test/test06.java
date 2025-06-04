package com.streams.test;

import java.util.Arrays;
import java.util.List;

public class test06 {
    public static void main(String[] args) {
        List<String> pala = List.of("Gomu", "Goku", "Nu", "Mi");
        String[] letras = pala.get(0).split("");

        System.out.println(Arrays.toString(letras));

        System.out.println(Arrays.toString(pala.stream()
                .map(l -> l.split(""))
                .flatMap(Arrays::stream).toArray()));
    }
}
