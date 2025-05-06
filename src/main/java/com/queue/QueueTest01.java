package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();

        fila.add("Leandro");
        fila.add("Mariana");
        fila.add("João");


        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
