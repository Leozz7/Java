package com.padroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingleLazy {
    private static AircraftSingleLazy INSTANCE;
    private final Set<String> assentos = new HashSet<>();
    private final String name;

    private AircraftSingleLazy(String name) {
        this.name = name;
    }

    {
        assentos.add("1A");
        assentos.add("1B");
    }

    public static AircraftSingleLazy getINSTANCE() {
        synchronized (AircraftSingleLazy.class) {
            if (INSTANCE == null) {
                INSTANCE = new AircraftSingleLazy("767-900");
            }
        }
        return INSTANCE;
    }

    public boolean comprarAssento(String a) {
        return assentos.remove(a);
    }
}
