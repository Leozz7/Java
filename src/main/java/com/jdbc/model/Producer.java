package com.jdbc.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Producer {
    private Integer id;
    private String nome;
}