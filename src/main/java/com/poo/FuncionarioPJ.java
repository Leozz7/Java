package com.poo;

public class FuncionarioPJ extends Funcionario{
    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * 0.15);
    }

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
}
