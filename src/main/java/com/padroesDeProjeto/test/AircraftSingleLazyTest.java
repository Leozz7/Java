package com.padroesDeProjeto.test;

import com.padroesDeProjeto.dominio.AircraftSingleLazy;

public class AircraftSingleLazyTest {
    public static void main(String[] args) {
        comprarAssento("1A");
        comprarAssento("1A");
    }

    private static void comprarAssento(String assento) {
        System.out.println(AircraftSingleLazy.getINSTANCE());
        AircraftSingleLazy aviao = AircraftSingleLazy.getINSTANCE();
        System.out.println(aviao.comprarAssento(assento));
    }
}
