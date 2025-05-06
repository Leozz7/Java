package com.generics.wildcard.test;

import com.generics.wildcard.dominio.Barco;
import com.generics.wildcard.dominio.service.BarcoService;

public class classeGenericaTest02 {
    public static void main(String[] args) {
        BarcoService barcoService = new BarcoService();
        Barco barco = barcoService.buscarBarcos();
        System.out.println("Usando o barco por um mes.... ");

        barcoService.barcoAlugados(barco);
    }
}
