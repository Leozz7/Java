package com.jUnit.test;

import com.jUnit.dominio.Manga;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTestTest {
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    public void setUp() {
        manga1 = new Manga<>("Dragon Ball", 200);
        manga2 = new Manga<>("Dragon Ball", 200);
    }

    @Test
    public void verificarSeInicializa(){
        Assertions.assertEquals("Dragon Ball", manga1.name());
        Assertions.assertEquals(200, manga2.episodios());
    }

    @Test
    public void verificarIgualdade() {
        Assertions.assertEquals(manga1, manga2);
    }

    @Test
    public void verificarHashCode() {
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }
}