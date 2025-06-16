package com.jdbc.test;

import com.jdbc.DAO.ProducerDAO;

import java.util.Scanner;

public class ConnTest {
    public static void main(String[] args) {
        ProducerDAO dao = new ProducerDAO();
        Scanner scanner = new Scanner(System.in);

        dao.adicionarProducer(scanner.nextLine());
    }
}
