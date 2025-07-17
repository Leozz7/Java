package com.jUnit.service;

import com.jUnit.dominio.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaServiceTest {
    @Test
    @DisplayName("A pessoanão é adulto, tem a idade menor que 18")
    void verificadorIdade_ReturnFalse_IdadeMenorQue18() {
        Pessoa p = Pessoa.builder().idade(15).build();
        PessoaService.verificadorIdade(p);
        assertFalse(PessoaService.verificadorIdade(p));
    }
}