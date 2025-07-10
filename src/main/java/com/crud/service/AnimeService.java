package com.crud.service;

import com.crud.model.Anime;
import com.crud.repository.AnimeRepository;

public class AnimeService {
    public static void save(Anime a) {
        AnimeRepository.save(a);
    }
}
