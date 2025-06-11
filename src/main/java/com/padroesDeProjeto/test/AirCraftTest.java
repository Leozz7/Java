package com.padroesDeProjeto.test;

import com.padroesDeProjeto.dominio.Aircraft;

public class AirCraftTest {
    public static void main(String[] args) {
        comprarAssento("A");
        comprarAssento("1A");
    }

    private static void comprarAssento(String a) {
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.comprarAssento(a));
    }
}
