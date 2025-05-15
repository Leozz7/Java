package com.classesInternas.test.anonimas;

import com.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNomeComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class classesAnonimas02 {
    public static void main(String[] args) {
        ArrayList<Barco> b = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));

        b.sort(((o1, o2) -> o1.getNome().compareTo(o2.getNome())));

        System.out.println(b);
    }
}
