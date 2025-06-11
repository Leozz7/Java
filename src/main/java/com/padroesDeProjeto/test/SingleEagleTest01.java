package com.padroesDeProjeto.test;

import com.padroesDeProjeto.dominio.AirCraftSingleEager;

public class SingleEagleTest01 {
    public static void main(String[] args) {
        comprarAssento("1A");
        comprarAssento("1A");
    }

    private static void comprarAssento(String a) {
        System.out.println(AirCraftSingleEager.getINSTANCE());
        AirCraftSingleEager aviao = AirCraftSingleEager.getINSTANCE();
        System.out.println(aviao.comprarAssento(a));
    }
}
