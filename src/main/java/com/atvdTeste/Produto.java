package com.atvdTeste;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Produto {
    int id;
    String nome;
    double preco;
    int quantidade;

}
