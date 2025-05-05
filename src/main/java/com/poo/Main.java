package com.poo;

public class Main {
    public static void main(String[] args) {

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Leandro", 3000);
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("José", 4000);

        System.out.println(funcionarioCLT.getNome() + " - Salário CLT: R$ " + funcionarioCLT.calcularSalario());
        System.out.println("Bônus CLT: R$ " + funcionarioCLT.calcularBonus());

        System.out.println(funcionarioPJ.getNome() + " - Salário PJ: R$ " + funcionarioPJ.calcularSalario());
    }
}
