package com.streams.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class generateStream01 {
    public static void main(String[] args) {

        // Ultimo incluso
        IntStream.rangeClosed(1,10)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Ultimo não incluso
        IntStream.range(1,10)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        Stream.of("Leandro", "Matheus", "Mariano", "Marcio", "Julia", "Mariana")
                .map(String::toUpperCase)
                .forEachOrdered(System.out::println);

        int num[] = {1,2,3,4,5};

        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);


    }
}
