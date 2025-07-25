package com.jUnit.dominio;

import java.util.Objects;

public record Manga<T>(String name, int episodios) {
    public Manga {
        Objects.requireNonNull(name);
    }
}
