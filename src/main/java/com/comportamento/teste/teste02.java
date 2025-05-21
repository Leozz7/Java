package com.comportamento.teste;

import com.comportamento.dominio.Carro;
import com.comportamento.interfaces.CarPredicate;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste02 {
    private static List<Carro> c = List.of(new Carro("Audi", "Preto", 2012), new Carro("Meca", "Azul", 2018), new Carro("Nivus", "Cinza", 2024));

    public static void main(String[] args) {
        System.out.println(filtrarCarro(c, car -> car.getCor().equals("Azul")));
    }

    private static @NotNull List<Carro> filtrarCarro(@NotNull List<Carro> c, CarPredicate carPredicate) {
        List<Carro> cFiltrados = new ArrayList<>();

        for (Carro car : c) {
            if (carPredicate.test((car))) {
                cFiltrados.add(car);
            }
        }
        return cFiltrados;
    }
}
