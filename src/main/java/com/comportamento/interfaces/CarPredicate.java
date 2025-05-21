package com.comportamento.interfaces;

import com.comportamento.dominio.Carro;

public interface CarPredicate {
    boolean test(Carro c);
}
