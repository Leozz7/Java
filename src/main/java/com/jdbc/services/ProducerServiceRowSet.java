package com.jdbc.services;

import com.jdbc.model.Producer;
import com.jdbc.repository.ProducerRepositoryRowSet;
import com.jdbc.validacoes.Validacoes;

import java.util.List;

public class ProducerServiceRowSet {
    public List<Producer> findByName(String name) {
        return Validacoes.verificarLista(ProducerRepositoryRowSet.findByNameJdbcRowSet(name));
    }
}
