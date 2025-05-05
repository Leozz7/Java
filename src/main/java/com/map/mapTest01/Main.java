package com.map.mapTest01;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        ArrayList<Produtos> p = new ArrayList<>();

        p.add(new Produtos(1, "Camisa", 10));
        p.add(new Produtos(2, "Calça", 14));
        p.add(new Produtos(3, "Tênis", 30));

        for (Produtos p1 : p) {
            e.adicionarProduto(p1, p1.getId());
        }

        System.out.println("Produtos no estoque:");
        e.listarProdutos();

        System.out.println("Busca: ");
        e.procurarNome("Ca");

        System.out.println("Aumentar Quantidade: ");
        e.aumentarQuantidade(1, 7);

        System.out.println("Remover produto");
        e.removerProduto(3);
        e.listarProdutos();
    }
}