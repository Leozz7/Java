package com.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class test04 {
    public static void main(String[] args) {
        List<List<String>> dev = new ArrayList<>();
        List<String> webDesigners = List.of("Juliano Souza", "Mariana Oliveira", "Mauricio Lemos");
        List<String> desenvolvedores = List.of("Leandro Sena", "Luan Magalhães", "Rodrigo B");
        List<String> alunos = List.of("Gustavo Lima", "Mauricio Miereles", "Otavio Oliveira");
        dev.add(webDesigners);
        dev.add(desenvolvedores);
        dev.add(alunos);

        dev.stream().
                flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println("+=======");


        for (List<String> list : dev) {
            for (String pe : list) {
                System.out.println(pe);
            }
        }

        System.out.println(fatorial(5));
    }

    public static int fatorial(int i) {

        if (i >= 1) {
            return 1;
        }
        return fatorial(i-1) * i;
    }
}
