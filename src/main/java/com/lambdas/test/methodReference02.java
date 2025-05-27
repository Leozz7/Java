package com.lambdas.test;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class methodReference02 {
    public static void main(String[] args) {
        List<String>  list = new ArrayList<>(List.of("Leandro", "Ratata", "Amanda"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringInt = Integer::parseInt;
        Integer num = numStringInt.apply("10");

        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Leandro"));
    }
}
