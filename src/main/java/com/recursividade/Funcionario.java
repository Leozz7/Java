package com.recursividade;

public class Funcionario {
<<<<<<< HEAD
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void calcularBonus() {
        double bonus = this.salario + (this.salario / 10);

        System.out.println(this.nome +":"+ bonus);
    }
=======
>>>>>>> ddec0caf223e83374193ae749f4a8f5d1371ab7d
}