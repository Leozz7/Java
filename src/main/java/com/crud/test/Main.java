package com.crud.test;

import com.crud.model.Producer;
import com.crud.service.ProducerService;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int esc = 0;
        do {
            menu();
            esc = scanner.nextInt();

            switch (esc) {
                case 1:
                    ProducerService.save(Producer.builder().nome(perguntaNome()).build());
                    break;
                case 2:
                    ProducerService.findAll().forEach(System.out::println);
                    break;
                case 3:
                    ProducerService.findByName(perguntaNome()).forEach(System.out::println);
            }
        } while (esc != 4);
    }

    private static void menu() {
        System.out.println("""
                [1] Save
                [2] FindAll
                [3] FindByName
                [4] Sair
                """);
    }

    private static String perguntaNome() {
        System.out.println("Digite o nome do Producer: ");
        return scanner.next();
    }
}
