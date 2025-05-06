package com.poo;

import java.util.HashMap;

public class Empresa {
    HashMap<Long, Funcionario> funcs = new HashMap<>();

    public void adicionarFunc(Funcionario f) {
        funcs.put(f.getId(),f);
    }

    public void listarTodos() {
        if (!funcs.isEmpty()) {
            for (Funcionario f : funcs.values()) {
                System.out.println(f);
            }
        } else {
            System.out.println("A lista esta vazia");
        }
    }

    public void buscaPorNome(String nome) {
        for (Funcionario f : funcs.values()) {
            if (nome.equals(f.getNome())) {
                System.out.println(f);
            }
        }
    }

    public void remover(String nome) {
        for (Funcionario f : funcs.values()) {
            if (nome.equals(f.getNome())) {
                funcs.remove(f.getId());
            }
        }
    }
}
