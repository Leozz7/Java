package com.crud.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Producer {
    Integer id;
    String nome;
}
