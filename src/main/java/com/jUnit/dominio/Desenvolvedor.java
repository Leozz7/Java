package com.jUnit.dominio;

import lombok.Getter;

@Getter
public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(int id, String linguagem) {
        super(id);
        this.linguagem = linguagem;
    }
}
