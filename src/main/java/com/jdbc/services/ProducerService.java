package com.jdbc.services;

import com.jdbc.model.Producer;
import com.jdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }
    public static void delete(Integer id) {
        if (id <= 0) {
            throw new IllegalArgumentException("O id inserido esta incorreto");
        }
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        if (producer.getId() <= 0) {
            throw new IllegalArgumentException("O id esta incorreto");
        }
        ProducerRepository.update(producer);
    }


}