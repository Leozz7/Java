package com.generics.dominio.service;

import java.util.ArrayList;

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
