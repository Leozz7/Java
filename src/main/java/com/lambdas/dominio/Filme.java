package com.lambdas.dominio;

public class Filme {
    private String nome;
    private int qtd;

    public Filme(String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", qtd=" + qtd +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
