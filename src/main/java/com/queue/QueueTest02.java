package com.queue;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Leandro") {
            @Override
            public int compareTo(@NotNull Consumidor o) {
                return 0;
            }
        };

        Queue<Consumidor> fila = new PriorityQueue<>();

        fila.add(consumidor);

        System.out.println(fila);


    }
}
