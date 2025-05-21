package com.comportamento.teste;

import com.comportamento.dominio.Carro;
import com.comportamento.interfaces.CarPredicate;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class teste03 {
    private static List<Carro> c = List.of(new Carro("Audi", "Preto", 2012), new Carro("Meca", "Azul", 2018), new Carro("Nivus", "Cinza", 2024));

    public static void main(String[] args) {

        System.out.println(filtrarCarro(c, car -> car.getCor().equalsIgnoreCase("Azul")));
        System.out.println(filtrarCarro(c, car -> car.getAno() < 2015));
        System.out.println(filtrarCarro(c, car -> car.getNome().equalsIgnoreCase("Meca")));
    }

    private static <T> List<T> filtrarCarro(List<T> l, Predicate<T> predicate) {
        List<T> cFiltrados = new ArrayList<>();
        for (T t : l) {
            if (predicate.test(t)) {
                cFiltrados.add(t);
            }
        }

        return cFiltrados;
    }
}
