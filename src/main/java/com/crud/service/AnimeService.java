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

    public static List<Anime> findByName(String name) {
        return Validacoes.isEmpity(AnimeRepository.findByName(name));
    }

    public static Anime findbyId(Integer id) {
        return Validacoes.isNull(AnimeRepository.findById(id));
    }

    public static void update(Integer id, String parametro, Anime a) {
        AnimeRepository.update(id, parametro, a);
    }

    public static void delete(Integer id) {
        AnimeRepository.delete(id);
    }
}
