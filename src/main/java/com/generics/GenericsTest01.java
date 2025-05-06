package com.generics;

import com.navigableMap.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();
        lista.add("Midoria");
        lista.add(123L);
        lista.add(new Consumidor("Leandro"));

        for (Object l : lista) {
            System.out.println(l);
        }

        add(lista, new Consumido("Mariano"));

        for (Object l : lista) {
            System.out.println(l);
        }
    }

    public static void add(List lista, Consumido c) {
      lista.add(c);
    }
}
