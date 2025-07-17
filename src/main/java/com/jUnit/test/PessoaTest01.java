package com.jUnit.test;

import com.jUnit.dominio.Pessoa;
import com.jUnit.service.PessoaService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PessoaTest01 {
    public static void main(String[] args) {
        log.info(PessoaService.verificadorIdade(Pessoa.builder().idade(15).build()));
    }
}
