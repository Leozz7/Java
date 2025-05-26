package com.lambdas.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Cliente {
    String nome;
    double saldo;

    Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
}

public class test05 {
    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(
                new Cliente("Alice", 6000),
                new Cliente("Bob", 3000),
                new Cliente("Carlos", 8000)
        );

        Predicate<Cliente> clientePredicate = cliente -> cliente.saldo >= 5000;
        Consumer<Cliente> enviarNot =  cliente -> System.out.println("Parabens " + cliente.nome +" voce é um cliente premium");

        clientes.stream()
                .filter(clientePredicate)
                .forEach(enviarNot);


    }

}
