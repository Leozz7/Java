package com.padroesDeProjeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Pais p){
        return switch (p) {
            case EUA -> new Dolar();
            case BRASIL -> new Real();
            default -> throw new IllegalArgumentException("País errado");
        };
    }
}
