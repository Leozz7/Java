package com.atvdTeste;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto(1, "Teclado Mecânico", 250.00, 5),
                new Produto(2, "Mouse Gamer", 120.00, 8),
                new Produto(3, "Cabo HDMI", 25.00, 15),
                new Produto(4, "Monitor 24\"", 1200.00, 2),
                new Produto(5, "Caixa de Som", 80.00, 6)
        );

        System.out.println("Produtos acima de R$50:");
        listarAcimaDe50(produtos).forEach(System.out::println);

        System.out.println("\nProdutos em ordem alfabética:");
        ordenarOrdemAlfabetica(produtos).forEach(System.out::println);

        System.out.println("\nValor total do estoque: R$ " + calcularTotalDeValorNoEstoque(produtos));

        System.out.println("\nProduto mais caro:");
        System.out.println(retornarProdutoComMaiorPreco(produtos));
    }

    private static List<Produto> listarAcimaDe50(List<Produto> p){
        return p.stream().filter(produto -> produto.getPreco() > 50).toList();
    }

    private static List<Produto> ordenarOrdemAlfabetica(List<Produto> p ) {
        return p.stream().sorted(Comparator.comparing(Produto::getNome)).toList();
    }

    private static double calcularTotalDeValorNoEstoque(List<Produto> p) {
        double total = 0;
        for (Produto pro : p) {
            total += pro.getPreco() * pro.getQuantidade();
        }
        return total;
    }

    private static Produto retornarProdutoComMaiorPreco(List<Produto> p) {
        return p.stream().max(Comparator.comparing(Produto::getPreco)).orElseThrow(() -> new IllegalArgumentException("Lista Vazia"));
    }




}
