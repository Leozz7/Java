package com.padroesDeProjeto.test;

import com.padroesDeProjeto.dominio.Currency;
import com.padroesDeProjeto.dominio.CurrencyFactory;
import com.padroesDeProjeto.dominio.Pais;

public class CurrencyTest {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Pais.BRASIL);
    }
}
