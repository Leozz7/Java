package com.jdbc.services;

import com.jdbc.model.Producer;
import com.jdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }
    public static void delete(Integer id) {
        validacaoID(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        validacaoID(producer.getId());
        ProducerRepository.update(producer);
    }

    private static void validacaoID(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("O id esta incorreto");
        }
    }
}