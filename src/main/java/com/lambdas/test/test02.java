package com.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class test02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Leandro", "Mariana", "Eduarda", "José");
        map(nomes, System.out::printf);
    }

    private static <T, R> List<R> map(List<T> lista, Function<T, R> f) {
        List<R> resultado = new ArrayList<>();
        for (T t : lista) {
            R r = f.apply(t);
            resultado.add(r);
        }

        return resultado;
    }
}
