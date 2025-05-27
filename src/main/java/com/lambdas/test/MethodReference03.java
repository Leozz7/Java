package com.lambdas.test;

import com.lambdas.dominio.Filme;
import com.lambdas.service.filmeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReference03 {
    public static void main(String[] args) {

        Supplier<filmeComparator> newfilmeComparator = filmeComparator::new;
        filmeComparator filmeComparator = newfilmeComparator.get();
        List<Filme> filmes = new ArrayList<>(List.of(new Filme("Uma sexta feira em Apuros", 6),new Filme("Abecedario", 8) ,new Filme("Homem Aranha", 2), new Filme("Homem de Ferro", 9)));

        filmes.sort(filmeComparator::comparByNome);

        System.out.println(filmes);

        BiFunction<String, Integer,Filme> filmeBiFunction = Filme::new;

    }
}
