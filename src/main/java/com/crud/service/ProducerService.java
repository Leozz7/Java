package com.crud.service;

import com.crud.model.Producer;
import com.crud.repository.ProducerRepository;
import com.crud.validations.Validacoes;

import java.util.List;

public class ProducerService {
    public List<Producer> findAll() {
        return Validacoes.isEmpity(ProducerRepository.findAll());
    }

    public List<Producer> findByName(String name) {
        return Validacoes.isEmpity(ProducerRepository.findByName(name));
    }
}
