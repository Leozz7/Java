package com.padroesDeProjeto.dominio;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String username;
    private String email;

    private Pessoa(String nome, String sobrenome, String username, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String username;
        private String email;

        public PessoaBuilder() {
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, sobrenome, username, email);
        }
    }
}
