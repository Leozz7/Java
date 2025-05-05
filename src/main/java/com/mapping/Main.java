package com.mapping;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto(1, "Camisa", 3, 5));
        estoque.adicionarProduto(new Produto(2, "Calça", 10, 8));
        estoque.adicionarProduto(new Produto(3, "Tênis", 2, 6));

        System.out.println("Produtos:");
        estoque.listarProdutos();

        System.out.println("\nVerificação de estoque mínimo:");
        estoque.verificarEstoqueMin();
    }
}
