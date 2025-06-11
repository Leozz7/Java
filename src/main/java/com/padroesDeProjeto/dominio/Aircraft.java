package com.padroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> assentos = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        assentos.add("A");
        assentos.add("1A");
    }

    public boolean comprarAssento(String a) {
        return assentos.remove(a);
    }
}
