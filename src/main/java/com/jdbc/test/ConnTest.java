package com.jdbc.test;

import com.jdbc.DAO.ProducerDAO;
import com.jdbc.dominio.Producer;

import java.util.Scanner;

public class ConnTest {
    public static void main(String[] args) {
        ProducerDAO dao = new ProducerDAO();
        Scanner scanner = new Scanner(System.in);
        Producer p = new Producer();

        dao.adicionarProducer(scanner.nextLine());
    }
}
