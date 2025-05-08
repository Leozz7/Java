package com.generics.dominio.service;

import com.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoService {
    private ArrayList<Barco> barcosDisponiveis = new ArrayList<>
            (List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcos() {
        System.out.println("Buscando barcos disponiveis");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void barcoAlugados(Barco c) {
        System.out.println("Devolvendo barco");
        barcosDisponiveis.add(c);
        System.out.println("Barco disponiveis: ");
        System.out.println(barcosDisponiveis);
    }
}
