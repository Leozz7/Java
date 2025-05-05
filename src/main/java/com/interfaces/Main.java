package com.interfaces;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Leandro", 25, 3000);
        f.apresentar();
        f.mostrarIdade();
        f.trabalhar();

    }
}
