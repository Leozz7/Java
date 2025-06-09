package com.streams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class generateStream02 {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .map(f -> f[0])
                .limit(10)
                .forEach(System.out::println);

        System.out.println();

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,500))
                .limit(10)
                .forEach(System.out::println);
    }
}
