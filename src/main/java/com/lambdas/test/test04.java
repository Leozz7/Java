package com.lambdas.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class test04 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 12, 7, 20, 3, 15);

        Predicate<Integer> nums = integer -> integer % 2 == 0 && integer > 10;

        list.stream()
                .filter(nums)
                .forEach(System.out::println);
    }
}
