package com.padroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingleEager {
    private static final AirCraftSingleEager INSTANCE = new AirCraftSingleEager("767-900");
    private final Set<String> assentos = new HashSet<>();
    private final String name;

    public AirCraftSingleEager(String name) {
        this.name = name;
    }

    {
        assentos.add("1A");
        assentos.add("1B");
    }

    public static AirCraftSingleEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean comprarAssento(String a) {
        return assentos.remove(a);
    }
}
