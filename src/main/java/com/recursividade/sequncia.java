package com.recursividade;

import java.util.List;
import java.util.Objects;

public class sequncia {
    public static int sequencia(List<Integer> list) {
        List<Integer> lm = list.stream()
                .distinct()
                .sorted().toList();
        int maiorSeq = 1;
        int aux =1;

        for (int i = 1; i < lm.size(); i++) {
            if (lm.get(i) == lm.get(i - 1) + 1) {
              aux++;
            } else{
                aux = 1;
            }

            if (aux > maiorSeq) {
                maiorSeq = aux;
            }
        }
        return maiorSeq;
    }

    public static void main(String[] args) {
        List<Integer> l = List.of(100,4,200,1,3,2);
        System.out.println(sequencia(l));
    }
}
