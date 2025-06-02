package com.poo;

public class recursividade {

    public static void main(String[] args) {
        int tt = fatorial(3);

        System.out.println(tt);
    }

    public static int fatorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * fatorial(i-1);
    }
}
