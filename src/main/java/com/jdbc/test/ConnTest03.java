package com.jdbc.test;

import com.jdbc.model.Producer;
import com.jdbc.services.ProducerService;

import java.util.List;

public class ConnTest03 {
    public static void main(String[] args) {
        /*Producer producer1 = Producer.builder().nome("Marcos Leonardo").build();
        Producer producer2 = Producer.builder().nome("Jalim").build();
        Producer producer3 = Producer.builder().nome("Dembelé").build();

        List<Producer> producers = List.of(producer1,producer2,producer3);

        ProducerService.saveTransaction(producers);*/

        System.out.println(ProducerService.findAll());;
    }
}
