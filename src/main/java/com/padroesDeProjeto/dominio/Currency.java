package com.padroesDeProjeto.dominio;

public interface Currency {
    String getSimbol();
}

class Real implements Currency{
    @Override
    public String getSimbol() {
        return "R$";
    }
}

class Dolar implements Currency {
    @Override
    public String getSimbol() {
        return "$";
    }
}

