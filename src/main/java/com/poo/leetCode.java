package com.poo;

import java.util.List;

public class leetCode {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 1, 2, 4, 1, 1);
        int num = verificarListaRepete(list.stream().sorted().toList());
        System.out.println("O número que mais se repete é " + num);
    }

    public static int verificarListaRepete(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia");
        }
        int num = 0, max = 1, aux = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i-1))) {
                aux++;
            } else {
                aux = 0;
            }
            if (aux > max) {
                num = list.get(i);
                max = aux;
            }
        }
        return num;
    }
}
