package com.lambdas.test;

import com.lambdas.dominio.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test03 {
    public static void main(String[] args) {
        Predicate<Usuario> usu = usuario -> usuario.getPontos() >= 1000;
        Consumer<Usuario> enviarNot = usuario -> System.out.println("Mnadei mensagem para " + usuario.getNome());

        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Ana", 1500),
                new Usuario("Bruno", 2000),
                new Usuario("Carla",  900),
                new Usuario("Daniel",  1200)
        );

        usuarios.stream()
                .filter(usu)
                .forEach(enviarNot);
    }
}
