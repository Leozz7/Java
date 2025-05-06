package com.generics.wildcard.dominio.service;

import com.generics.wildcard.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
    private ArrayList<Carro> carrosDisponiveis = new ArrayList<>
            (List.of(new Carro("BMW"), new Carro("Meca")));

    public Carro buscarCarros() {
        System.out.println("Buscando carros disponiveis");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void carrosAlugados(Carro c) {
        System.out.println("Devolvendo carro");
        carrosDisponiveis.add(c);
        System.out.println("Carro disponiveis: ");
        System.out.println(carrosDisponiveis);
    }
}
