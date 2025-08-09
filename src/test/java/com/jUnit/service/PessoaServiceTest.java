package com.jUnit.service;

import com.jUnit.dominio.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaServiceTest {
    private Pessoa adulto;
    private Pessoa noAldulto;

    @BeforeEach
    public void setUp() {
        adulto = Pessoa.builder().idade(18).build();
        noAldulto = Pessoa.builder().idade(15).build();
    }
    @Test
    @DisplayName("A pessoa não é adulto, tem a idade menor que 18")
    void verificadorIdade_ReturnFalse_IdadeMenorQue18() {
        assertFalse(PessoaService.verificadorIdade(noAldulto));
    }

    @Test
    @DisplayName("A pessoa é adulto, tem a idade maior ou igual que 18")
    void verificadorIdade_ReturnTrue_IdadeMaiorOuIgualQue18() {
        assertTrue(PessoaService.verificadorIdade(adulto));
    }

    @Test
    @DisplayName("Retornou um NullPoiterException")
    void verificadorIdada_NullPointerException() {
         assertThrows(IllegalArgumentException.class,
                () -> PessoaService.verificadorIdade(null), "Pessoa não pode ser nula");
    }

    @Test
    @DisplayName("Retornou uma list apenas com adultos")
    void filtroRemoveNaoAdultos_ReturnListApenasComAdultos() {
        Pessoa p1 = Pessoa.builder().idade(17).build();
        Pessoa p2 = Pessoa.builder().idade(18).build();
        Pessoa p3 = Pessoa.builder().idade(21).build();
        List<Pessoa> pessoaList = List.of(p1,p2,p3);
        assertEquals(2, PessoaService.filtroRemoveNaoAdultos(pessoaList).size());

    }

}