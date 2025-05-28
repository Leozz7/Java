package com.Optional.repositorio;

import com.Optional.dominio.Manga;

import java.util.List;
import java.util.Optional;

public class MangaRepo {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no Hero", 377), new Manga(2, "Overload", 255));

    public Optional<Manga> buscaid(Integer id) {
        return mangas.stream()
                .filter(manga -> manga.getId().equals(id))
                .findAny();
    }

    public Optional<Manga> buscaNome(String nome) {
        return mangas.stream()
                .filter(manga -> manga.getNome().equalsIgnoreCase(nome))
                .findAny();
    }
}
