package com.interfaces;

<<<<<<< HEAD
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
=======
public class Funcionario {
>>>>>>> ddec0caf223e83374193ae749f4a8f5d1371ab7d
}
