package com.recursividade;

import java.util.HashMap;
import java.util.List;

public class sequencia2 {
    public static void main(String[] args) {
        List<Integer> l = List.of(100,4,200,1,3,2);
        System.out.println(sequencial(l));
    }

    public static int sequencial(List<Integer> list){
        HashMap<Integer,Integer> l = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            l.put(list.get(i), i);
        }

        int seq = 1, aux = 1;

        for (Integer i : list) {
            if (l.containsKey(i + 1)) {
                aux++;
            } else {
                aux = 1;
            }
            if (aux > seq) {
                seq = aux;
            }
        }
        return seq;
    }
}
