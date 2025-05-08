package com.generics.test;

import java.util.List;

public class wildCardTest01 {
    public static void main(String[] args) {
        List<Cachorro> c = List.of(new Cachorro(), new Cachorro());
        List<Gato> g = List.of(new Gato(), new Gato());

        printConsulta(g);
    }

    private static void printConsulta(List<? extends Animal> animais) {
        for (Animal a : animais) {
            a.emitirSom();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animais) {
        animais.add(new Gato());
        animais.add(new Cachorro());
    }
}
