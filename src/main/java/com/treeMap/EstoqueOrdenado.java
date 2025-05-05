package com.treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

public class EstoqueOrdenado {
    NavigableMap<Long, Produto> estoque = new TreeMap<>();

    public void adicionarProduto(Produto p) {
        try {
            estoque.put(p.getId(), p);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar o produto");
        }
    }

    public void listarPorId(Long id) {
        Produto p = estoque.get(id);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Valor invalido inserido");
        }
    }

    public void listarPorNome(String nome) {
        boolean aux = false;
        for (Produto p : estoque.values()) {
            if (Objects.equals(p.getNome(), nome)) {
                System.out.println(p);
                aux = true;
            }
        }
        if (!aux) {
            System.out.println("Nome não encontrado");
        }
    }

    public void listarPorQuantidade(Integer quantidade) {
        boolean aux = false;
        for (Produto p : estoque.values()) {
            if (Objects.equals(p.getQuantidade(), quantidade)) {
                System.out.println(p);
                aux = true;
            }
        }
        if (!aux) {
            System.out.println("Nenhum produto encontrado com a quantidade: " + quantidade);
        }
    }

    public void listarTodos() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque está vazio");
        } else {
            for (Map.Entry<Long , Produto> entry : estoque.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }
}
