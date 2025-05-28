package com.Optional.test;

import com.Optional.dominio.Manga;
import com.Optional.repositorio.MangaRepo;

public class OpitionalTest02 {
    public static void main(String[] args) {
        MangaRepo repo = new MangaRepo();

        repo.buscaNome("Boku no Hero").ifPresent(m -> m.setNome("Boku no Hero 2"));

        Manga mangaId = repo.buscaid(3)
                .orElseThrow(IllegalArgumentException::new);

        Manga newManga = repo.buscaNome("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 223));

        System.out.println(newManga);
    }
}
