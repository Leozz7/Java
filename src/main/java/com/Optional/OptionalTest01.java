package com.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("O tal do LZ");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String>o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("========");

        Optional<String> nomeOptional = Optional.ofNullable(findNome("Leandro"));
        System.out.println(nomeOptional);


    }

    private static String findNome(String nome) {
        List<String> nomes = List.of("Leandro", "Maria");
        int i = nomes.indexOf(nome);
        if (i != 0) {
            return nomes.get(i);
        }
        return null;
    }
}
