package com.generics.wildcard.test;

import com.generics.wildcard.dominio.Barco;
import com.generics.wildcard.dominio.Carro;
import com.generics.wildcard.dominio.service.RentalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class classeGenericaTest03 {
    public static void main(String[] args) {
        ArrayList<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        ArrayList<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Meca")));

        RentalService<Barco> rentalB = new RentalService<>(barcosDisponiveis);
        RentalService<Carro> rentalC = new RentalService<>(carrosDisponiveis);

        Carro c = rentalC.buscarObjeto();

        System.out.println("========================");

        Barco b = rentalB.buscarObjeto();


    }

    public static class Consumido {
        private Long id;
        private String nome;

        @Override
        public String toString() {
            return "Consumidor{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Consumido that = (Consumido) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }

        public Consumido(String nome) {
            this.id = ThreadLocalRandom.current().nextLong();
            this.nome = nome;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
}
