package com.exceptions.ex;

public class Main {
    public static void main(String[] args) {
        cadastroClientes c = new cadastroClientes();
        try {
            c.adicionarClientes(new Cliente(1, "João", 15));
        } catch (cadastroClientes.ClienteInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Encerrando operação...");
        }

    }
}
