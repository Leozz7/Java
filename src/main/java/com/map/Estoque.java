package com.map;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    Map<Integer,Produtos> map = new HashMap<>();
    public void adicionarProduto(Produtos p, int id) {
        map.put(id, p);
    }

    public void removerProduto(int id) {
        map.remove(id);
    }

    public void listarProdutos() {
        for (Produtos p : map.values()) {
            System.out.println(p);
        }
    }

    public void procurarNome(String nome) {
        for (Produtos p : map.values()) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void aumentarQuantidade(int id, int quantidade) {
        Produtos p = map.get(id);
        if (p != null) {
            p.setQuantidade(p.getQuantidade() + quantidade);
        } else  {
            System.out.println("Esse produto não foi encontrado");
        }
    }
=======
public class Estoque {
>>>>>>> ddec0caf223e83374193ae749f4a8f5d1371ab7d
}
