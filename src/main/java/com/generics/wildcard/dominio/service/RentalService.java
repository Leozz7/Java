package com.generics.wildcard.dominio.service;

import com.generics.wildcard.dominio.Carro;

import java.util.ArrayList;
import java.util.Objects;

public class RentalService<TIPO> {
    private ArrayList<TIPO> objetosDisponiveis;

    public RentalService(ArrayList<TIPO> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public TIPO buscarObjeto() {
        System.out.println("Buscando objetos disponiveis");
        TIPO t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objetos: " + t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void objetoAlugados(TIPO t) {
        System.out.println("Devolvendo objeto");
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis: ");
        System.out.println(objetosDisponiveis);
    }
}
