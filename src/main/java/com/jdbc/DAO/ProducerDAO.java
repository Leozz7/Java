package com.jdbc.DAO;

import com.jdbc.conn.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProducerDAO {
    public void adicionarProducer(String nome) {
        String sql = "INSERT INTO producer (nome) VALUES (?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nome);

            if (ps.executeUpdate() > 0) {
                System.out.println("Producer adicionado com sucesso!");
            } else {
                System.out.println("Erro ao adicionar o producer");
            }
        } catch (SQLException e) {
            System.err.println("Eror ao adicionar o Producer" + e.getMessage());
        }
    }
}
