package com.poo;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Funcionario {

    private Long id;
    private String nome;
    private double salarioBase;

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, double salarioBase) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
}
