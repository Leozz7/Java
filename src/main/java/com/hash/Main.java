package com.hash;

<<<<<<< HEAD

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        ArrayList<Produto> p = new ArrayList<>();
        p.add(new Produto(1, "Lapis", 14.4f));
        p.add(new Produto(1, "Borracha", 12.2f));

        if (p.get(0).equals(p.get(1))) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }

        HashSet<Produto> produtos = new HashSet<>();

        produtos.add(new Produto(1, "Cabeçote", 20.0f));
        produtos.add(new Produto(2, "Rabeira", 15.3f));

        for (Produto pr : produtos) {
            System.out.println(pr);
        }
    }
=======
public class Main {
>>>>>>> ddec0caf223e83374193ae749f4a8f5d1371ab7d
}
