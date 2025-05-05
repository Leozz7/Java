package com.poo;

public class FuncionarioCLT extends Funcionario implements Bonificavel{
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * 0.10);
    }

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return 500;
    }
}
