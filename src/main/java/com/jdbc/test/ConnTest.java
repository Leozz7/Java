package com.jdbc.test;

import com.jdbc.model.Producer;
import com.jdbc.services.ProducerService;

public class ConnTest {
    public static void main(String[] args) {
        //ProducerService.save(Producer.builder().nome("Teste").build());
        //ProducerService.delete(4);
        //ProducerService.update(Producer.builder().id(1).nome("Leandro").build());
        ProducerService.findAll()
                .forEach(System.out::println);
    }
}
