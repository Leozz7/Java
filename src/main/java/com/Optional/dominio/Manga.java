package com.Optional.dominio;

import java.util.Objects;

public class Manga {
    private String nome;
    private Integer id;
    private int ep;

    public Manga( Integer id, String nome, int ep) {
        this.nome = nome;
        this.id = id;
        this.ep = ep;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", ep=" + ep +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
}
