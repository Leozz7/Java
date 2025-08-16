package com.atvdTeste;

import java.util.ArrayList;
import java.util.List;

public class leet {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number (int num) {
        char[] c = String.valueOf(num).toCharArray();
        List<Character> numLetra = new ArrayList<>();
        for (Character n : c) {
            numLetra.add(n);
        }
        for (int i = 0; i < numLetra.size(); i++) {
            if (numLetra.get(i) == '6') {
                StringBuilder retorno = new StringBuilder();
                numLetra.set(i, '9');
                for (Character t : numLetra) {
                    retorno.append(t);
                }
                return Integer.parseInt(String.valueOf(retorno));
            }
        }

        return num;
    }
}
