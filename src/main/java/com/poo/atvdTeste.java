package com.poo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class atvdTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numAle = ThreadLocalRandom.current().nextInt(0,101);
        System.out.println(numAle);

        System.out.println("Digite um numero entre 0 e 100:");

        for (int i = 0; i < 5; i++) {
            int numEsco;
            do {
                numEsco = scanner.nextInt();
            } while (!verificar(numEsco));

            if (acertou(numEsco, numAle)) {
                System.out.println("Você acertou o numero");
                break;
            } else {
               errou(numEsco, numAle);
            }
        }

        scanner.close();
    }

    static boolean verificar(Integer num) {
        return (num >= 0 && num <= 100);
    }

    static boolean acertou(Integer num, Integer ale) {
        return num.equals(ale);
    }

    static void errou(Integer num, Integer ale) {
        if (num > ale) {
            System.out.println("O número é menor");
        } else {
            System.out.println("O número é maior");
        }
    }
}
