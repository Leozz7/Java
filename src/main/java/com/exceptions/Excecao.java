package com.exceptions;

import java.util.ArrayList;

public class Excecao {
    public static void main(String[] args) {
        int[] vetor = new int[4];

        System.out.println("Antes do exception");

        vetor[4] = 0;

        System.out.println("Esse texto não será impresso");
    }
}
