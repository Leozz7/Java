package com.mapping;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    Map<Integer, Produto> map = new HashMap<>();

    public void adicionarProduto(Produto p) {
        map.put(p.getId(), p);
    }

    public void listarProdutos() {
        for (Produto p : map.values()) {
            System.out.println(p);
        }
    }

    public void verificarEstoqueMin() {
        for (Produto p : map.values()) {
            if (p.getQuantidade() < p.getQtndMin()) {
                System.out.println(p.getNome() + " está abaixo do estoque");
            }
        }
    }
}
