package com.comportamento.teste;

import com.comportamento.dominio.Carro;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Carro> c = List.of(new Carro("Audi", "Preto", 2012), new Carro("Meca", "Azul", 2018), new Carro("Nivus", "Cinza", 2024));
        int op = 0;

        do {
            System.out.println("Quer filtrar por o que?");
            System.out.println("[1] Cor \n[2] Ano \n[3] Nome \n[4] Sair");
            op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.println("Qual a cor que irá filtrar?");
                String para = scanner.nextLine();

                System.out.println(filtrarCarroCor(c, para));
            }
            if (op == 2) {
                System.out.println("Qual o ano que irá filtrar?");
                int para = scanner.nextInt();

                System.out.println(filtrarCarroAno(c, para));
            }
            if (op == 3) {
                System.out.println("Qual o nome que irá filtrar?");
                String para = scanner.nextLine();

                System.out.println(filtrarCarroNome(c, para));
            }
        } while (op != 4);

    }

    private static @NotNull List<Carro> filtrarCarroCor(@NotNull List<Carro> c, String param) {
        List<Carro> cFiltrados = new ArrayList<>();

        for (Carro car : c) {
            if (car.getCor().equalsIgnoreCase(param)) {
                cFiltrados.add(car);
            }
        }
        return cFiltrados;
    }

    private static @NotNull List<Carro> filtrarCarroNome(@NotNull List<Carro> c, String param) {
        List<Carro> cFiltrados = new ArrayList<>();

        for (Carro car : c) {
            if (car.getNome().equalsIgnoreCase(param)) {
                cFiltrados.add(car);
            }
        }
        return cFiltrados;
    }

    private static @NotNull List<Carro> filtrarCarroAno(@NotNull List<Carro> c, int param) {
        List<Carro> cFiltrados = new ArrayList<>();

        for (Carro car : c) {
            if (car.getAno() < param) {
                cFiltrados.add(car);
            }
        }
        return cFiltrados;
    }
}
