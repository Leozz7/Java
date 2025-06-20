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

    public static List<Producer> findName(String name) {
        verificarLista(ProducerRepository.findName(name));
        return ProducerRepository.findName(name);
    }

    public static void showMetaData() {
        ProducerRepository.showMetaData();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
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