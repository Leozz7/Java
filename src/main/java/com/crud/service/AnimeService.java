package com.crud.service;

import com.crud.model.Anime;
import com.crud.repository.AnimeRepository;
import com.crud.validations.Validacoes;

import java.util.List;

public class AnimeService {
    public static void save(Anime a) {
        AnimeRepository.save(a);
    }

    public static List<Anime> findAll() {
        return Validacoes.isEmpity(AnimeRepository.findAll());
    }
}
