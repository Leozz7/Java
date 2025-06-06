package com.streams.test;

import java.util.List;

public class reduce01 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7);

        nums.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        System.out.println("=====================");

        nums.stream()
                .reduce((x,y) -> x*y)
                .ifPresent(System.out::println);

        nums.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}
