package com.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class test01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Leandro", "Matheus", "Luan", "Mariano");
        List<Integer> nums = List.of(1,2,3,4,5,6,7);
        forEach(nomes, System.out::println);
        forEach(nums, System.out::println);
    }

    private static <T> void forEach(List<T> lista, Consumer<T> c) {
        for (T l : lista) {
            c.accept(l);
        }
    }
}
