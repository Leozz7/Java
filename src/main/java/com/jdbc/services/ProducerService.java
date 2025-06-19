package com.jdbc.services;

import com.jdbc.model.Producer;
import com.jdbc.repository.ProducerRepository;

import java.util.List;

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

    public static List<Producer> findAll() {
        verificarLista(ProducerRepository.findAll());
        return ProducerRepository.findAll();
    }

    private static void verificarLista(List<Producer> p) {
        if (p.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia");
        }
    }

    private static void validacaoID(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("O id esta incorreto");
        }
    }
}