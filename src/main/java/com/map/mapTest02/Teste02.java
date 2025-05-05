package com.map.mapTest02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste02 {
    public static void main(String[] args) {

        Consumidor Consumidor1 = new Consumidor("Leandro");
        Consumidor Consumidor2 =new Consumidor("Julia");

        Manga Manga1 = new Manga(5L, "Hellsing Ultimate", 19.9F);
        Manga Manga2 = new Manga(1L, "Berserk", 9.5F);
        Manga Manga3 = new Manga(4L, "Pokemon", 3.2F);
        Manga Manga4 = new Manga(3L, "Attack on Titan", 11.2F);
        Manga Manga5 = new Manga(2L, "Dragon Ball Z", 2.99F);

        List<Manga> mangaConsumidor1List = List.of(Manga1, Manga2, Manga3);
        List<Manga> mangaConsumidor2List = List.of(Manga4, Manga5);
        HashMap<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(Consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(Consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.print(entry.getKey().getNome() + "- ");
            for (Manga m : entry.getValue()) {
                System.out.print("("+m.getNome()+ ") ");
            }
            System.out.println();
        }
    }
}
