package com.jdbc.services;

import com.jdbc.model.Producer;
import com.jdbc.repository.ProducerRepository;
import com.jdbc.validacoes.Validacoes;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void saveTransaction(List<Producer> producers) {
        ProducerRepository.saveTransaction(producers);
    }
    public static void delete(Integer id) {
        Validacoes.validacaoID(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        Validacoes.validacaoID(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
        return Validacoes.verificarLista(ProducerRepository.findAll());
    }

    public static List<Producer> findName(String name) {
        return Validacoes.verificarLista(ProducerRepository.findName(name));
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

    public static List<Producer> findAllUpperCase() {
        return Validacoes.verificarLista(ProducerRepository.findAllUpperCase());
    }

    public static List<Producer> findNameAndUpdate(String name) {
        return Validacoes.verificarLista(ProducerRepository.findNameAndUpdateToUpperCase(name));
    }

    public static List<Producer> findNameAndInsert(String name) {
        return Validacoes.verificarLista(ProducerRepository.findNameAndInsertRow(name));
    }

    public static void deletName(String name) {
        ProducerRepository.deletebyName(name);
    }
}