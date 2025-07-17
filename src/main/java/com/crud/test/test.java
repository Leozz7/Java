package com.crud.test;

import com.crud.model.Anime;
import com.crud.model.Producer;
import com.crud.service.AnimeService;

public class test {
    public static void main(String[] args) {
        // AnimeService.save(Anime.builder().nome("Dragon Ball").episodios(234).producer(Producer.builder().id(11).build()).build());

        AnimeService.findAll().forEach(System.out::println);

        //AnimeService.findByName("Naruto").forEach(System.out::println);

        //System.out.println(AnimeService.findbyId(2));

        // AnimeService.delete(1);

        AnimeService.update(3, "episodios", "400");

        AnimeService.findAll().forEach(System.out::println);
    }
}
