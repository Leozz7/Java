package com.lambdas.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Usuario {
    private Long id;
    private String nome;
    private int pontos;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Usuario(String nome, int pontos) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.nome = nome;
        this.pontos = pontos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
