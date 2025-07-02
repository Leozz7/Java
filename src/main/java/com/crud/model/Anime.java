package com.crud.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Anime {
    Integer id;
    String nome;
    Integer episodios;
    Producer producer;
}
