package com.generics.test;

import com.generics.dominio.Barco;

import java.util.List;

public class metodoGenerico01 {
    public static void main(String[] args) {
        List<Barco> barco = criarArray(new Barco("Iate"));
        System.out.println(barco);
    }

    public static <TIPO> List<TIPO> criarArray(TIPO t) {
       return List.of(t);
    }
}


