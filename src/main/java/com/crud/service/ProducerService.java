package com.crud.service;

import com.crud.model.Producer;
import com.crud.repository.ProducerRepository;
import com.crud.validations.Validacoes;

import java.util.List;

public class ProducerService {

    public static void save(Producer p) {
        ProducerRepository.save(p);
    }

    public static List<Producer> findAll() {
        return Validacoes.isEmpity(ProducerRepository.findAll());
    }

    public static List<Producer> findByName(String name) {
        return Validacoes.isEmpity(ProducerRepository.findByName(name));
    }

    public static void delete(Integer id) {
        ProducerRepository.delete(id);
    }

    public static void update(Producer p) {
        ProducerRepository.update(p);
    }
}
