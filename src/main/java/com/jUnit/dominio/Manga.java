package com.jUnit.dominio;

public record Manga(String name, int episodios) {
    @Override
    public String toString() {
        return "Manga{" +
                "name='" + name + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
