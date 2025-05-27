package com.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class test07 {
    public static void main(String[] args) {
        List<String> strings = List.of("Leandro", "Mariana", "Julia");
        List<Integer> nums = map(strings, String::length);
        List<String> map = map(strings, String::toUpperCase);
        System.out.println(nums);
        System.out.println(map);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T t: list) {
            R r = function.apply(t);
            result.add(r);
        }

        return result;
    }
}
