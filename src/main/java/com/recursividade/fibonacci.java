package com.recursividade;

public class fibonacci {
    public static void main(String[] args) {
        int num = 0;
        int aux = 1;
        int fibo = 1;

        System.out.print(num + ", ");
        System.out.print(fibo + ", ");
        for (int i = 0; i < 8; i++) {
            System.out.print(fibo + ", ");

            num = aux;
            aux = fibo;
            fibo = aux + num;
        }
    }
}
