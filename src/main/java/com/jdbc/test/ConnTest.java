package com.jdbc.test;


import com.jdbc.conn.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnTest {
    public static void main(String[] args) {
        adicionarProducer("Leoz");
    }
    public static void adicionarProducer(String nome) {
        String sql = "INSERT INTO producer (nome) VALUES (?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nome);

            if (ps.executeUpdate() > 0) {
                System.out.println("Anime adicionado com sucesso!");
            } else {
                System.out.println("Erro ao adicionar o anime");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao adicionar o anime: " + e.getMessage());
        }
    }
}
