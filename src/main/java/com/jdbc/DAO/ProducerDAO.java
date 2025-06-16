package com.jdbc.DAO;

import com.jdbc.conn.Conexao;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Log4j2
public class ProducerDAO {
    public void adicionarProducer(String nome) {
        String sql = "INSERT INTO producer (nome) VALUES (?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nome);

            if (ps.executeUpdate() > 0) {
                log.info("Producer adicionado com sucesso!");
            } else {
                log.error("Erro ao adicionar o producer");
            }
        } catch (SQLException e) {
            log.error("Eror ao adicionar o Producer{}", e.getMessage());
        }
    }
}