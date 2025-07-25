package com.jUnit.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
    private int id;

    public Funcionario(int id) {
        this.id = id;
    }
}
