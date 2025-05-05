package com.interfaces;

public class Funcionario extends Pessoa implements Trabalhador{

    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void trabalhar() {
        System.out.println("Funcionário está trabalhando");
    }


    @Override
    public void apresentar() {
        System.out.println("NOME: " + getNome());
        System.out.println("IDADE: " + getIdade());
        System.out.println("SALÁRIO: " + getSalario());
    }

    @Override
    public void load() {

    }
}
