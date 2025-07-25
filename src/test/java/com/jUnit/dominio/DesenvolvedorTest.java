package com.jUnit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {
    private Funcionario funcionarioDesenvolvedor;

    @Test
    public void instanceOf_ExecutarClasseFilho(){
        funcionarioDesenvolvedor = new Desenvolvedor(1, "Java");

        if (funcionarioDesenvolvedor instanceof Desenvolvedor desenvolvedor) {
            Assertions.assertEquals("Java", desenvolvedor.getLinguagem());
        }
    }

}