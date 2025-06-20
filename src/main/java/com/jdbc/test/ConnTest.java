package com.jdbc.test;

import com.jdbc.services.ProducerService;

public class ConnTest {
    public static void main(String[] args) {
        //ProducerService.save(Producer.builder().nome("Teste").build());
        //ProducerService.delete(4);
        //ProducerService.update(Producer.builder().id(1).nome("Leandro").build());
        //ProducerService.findAll().forEach(System.out::println);
        //        .forEach(System.out::println);
        //ProducerService.findName("Leandro")
        //        .forEach(System.out::println);
        // ProducerService.showMetaData();
        //ProducerService.showDriverMetaData();
        //ProducerService.showTypeScrollWorking();
        // ProducerService.findAllUpperCase().forEach(System.out::println);
        ProducerService.findNameAndUpdate("Le").forEach(System.out::println);
    }
}
