package com.mapping;

import java.util.Objects;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private int qtndMin;

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", qtndMin=" + qtndMin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id && quantidade == produto.quantidade && qtndMin == produto.qtndMin && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, quantidade, qtndMin);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQtndMin() {
        return qtndMin;
    }

    public void setQtndMin(int qtndMin) {
        this.qtndMin = qtndMin;
    }

    public Produto(int id, String nome, int quantidade, int qtndMin) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.qtndMin = qtndMin;
    }
}
