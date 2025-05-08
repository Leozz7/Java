package com.generics.test;

import com.generics.dominio.Carro;
import com.generics.dominio.service.CarroService;

public class classeGenericaTest01 {
    public static void main(String[] args) {
        CarroService carroService = new CarroService();
        Carro carro = carroService.buscarCarros();
        System.out.println("Usando o carro por um mes.... ");

        carroService.carrosAlugados(carro);
    }
}
