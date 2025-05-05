package com.treeMap;

public class Main {
    public static void main(String[] args) {
        EstoqueOrdenado estoque = new EstoqueOrdenado();

        Produto p1 = new Produto("Arroz", 10);
        Produto p2 = new Produto("Feijão", 5);
        Produto p3 = new Produto("Arroz", 20);

        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);

        System.out.println(">>> Buscar por ID:");
        estoque.listarPorId(p1.getId());

        System.out.println("\n>>> Buscar por nome:");
        estoque.listarPorNome("Arroz");

        System.out.println("\n>>> Buscar por quantidade:");
        estoque.listarPorQuantidade(5);

        System.out.println("\n>>> Todos os produtos:");
        estoque.listarTodos();
    }
}
