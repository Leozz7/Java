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

    public int removeElement(int[] nums, int val) {
        int qtde = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                qtde--;
            }
        }
        return qtde;
    }

    public static int strStr(String haystack, String needle) {
        char[] c = String.valueOf(haystack).toCharArray();
        char[] b = String.valueOf(needle).toCharArray();

        for (int i = 0; i < Math.max(c.length, b.length); i++) {
            if (c[i] != b[i]) {
                return -1;
            }
        }
        return 0;
    }

    public static int palavraMaior(char[] c, char[] b) {
        return Math.max(c.length, b.length);
    }
}
