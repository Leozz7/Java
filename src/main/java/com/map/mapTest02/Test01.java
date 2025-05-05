package com.map.mapTest02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Consumidor> c = new ArrayList<>();
        ArrayList<Manga> m = new ArrayList<>();

        c.add(new Consumidor("Leandro"));
        c.add(new Consumidor("Julia"));

        m.add(new Manga(5L, "Hellsing Ultimate", 19.9F));
        m.add(new Manga(1L, "Berserk", 9.5F));
        m.add(new Manga(4L, "Pokemon", 3.2F));
        m.add(new Manga(3L, "Attack on Titan", 11.2F));
        m.add(new Manga(2L, "Dragon Ball Z", 2.99F));


        HashMap<Consumidor, Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(c.get(0), m.get(0));
        consumidorManga.put(c.get(1), m.get(3));

        for (Map.Entry<Consumidor , Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " -- " + entry.getValue().getNome());
        }
    }
}
