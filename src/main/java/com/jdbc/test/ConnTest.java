package com.jdbc.test;

import com.jdbc.model.Producer;
import com.jdbc.repository.ProducerRepository;

import java.util.Scanner;

public class ConnTest {
    public static void main(String[] args) {
        ProducerRepository.save(Producer.builder().nome("Teste").build());
    }
}
