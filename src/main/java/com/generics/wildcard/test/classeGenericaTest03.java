package com.generics.wildcard.test;

import com.generics.wildcard.dominio.Barco;
import com.generics.wildcard.dominio.Carro;
import com.generics.wildcard.dominio.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class classeGenericaTest03 {
    public static void main(String[] args) {
        ArrayList<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        ArrayList<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Meca")));

        RentalService<Barco> rentalB = new RentalService<>(barcosDisponiveis);
        RentalService<Carro> rentalC = new RentalService<>(carrosDisponiveis);

        Carro c = rentalC.buscarObjeto();

        System.out.println("========================");

        Barco b = rentalB.buscarObjeto();


    }
}
