package com.lambdas.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class test06 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7);
        Consumer<Integer> consumer = System.out::println;
        Predicate<Integer> veri = integer -> integer > 4;

        nums.stream()
                .filter(veri)
                .forEach(consumer);
    }
}
