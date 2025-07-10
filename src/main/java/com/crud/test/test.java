package com.crud.test;

import com.crud.model.Anime;
import com.crud.model.Producer;
import com.crud.service.AnimeService;

public class test {
    public static void main(String[] args) {
        // AnimeService.save(Anime.builder().nome("Naruto").episodios(300).producer(Producer.builder().id(1).build()).build());

        AnimeService.findAll().forEach(System.out::println);

        // AnimeService.delete(1);
    }
}
