package com.exceptions;

import java.util.ArrayList;

public class Excecao {
    public static void main(String[] args) {
        int[] vetor = new int[4];

        try {
            System.out.println("Antes do exception");

            vetor[4] = 3;

            System.out.println("Esse texto não será impresso");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando");
        }

        System.out.println("Esse texto será impresso apos o exception");
    }
}
