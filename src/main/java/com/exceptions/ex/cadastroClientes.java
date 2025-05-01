package com.exceptions.ex;

import java.util.HashMap;

public class cadastroClientes {
    HashMap<Integer, Cliente> clientes = new HashMap<>();

    public void adicionarClientes(Cliente c) throws ClienteInvalidoException {
        if (c.getIdade() < 18) {
            throw new ClienteInvalidoException("Cliente tem menos de 18 anos");
        }
        if (clientes.containsKey(c.getId())) {
            throw new ClienteInvalidoException("Cliente com esse id ja foi cadastrado");
        }
            clientes.put(c.getId(),c);
        System.out.println("Cliente adicionado com sucesso");
    }

    public void listarClientes() {
        for (Cliente c : clientes.values()) {
            System.out.println(clientes);
        }
    }

    public void removerCliente(int id) {
        clientes.remove(id);
    }

    public static class ClienteInvalidoException extends Exception {
        public ClienteInvalidoException(String mensagem) {
            super(mensagem);
        }
    }


}
