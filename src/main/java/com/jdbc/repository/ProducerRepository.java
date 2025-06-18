package com.jdbc.repository;

import com.jdbc.conn.Conexao;
import com.jdbc.model.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO producer (nome) VALUES (?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, producer.getNome());

            if (ps.executeUpdate() > 0) {
                log.info("Producer adicionado com sucesso!");
            } else {
                log.error("Erro ao adicionar o producer");
            }
        } catch (SQLException e) {
            log.error("Eror ao adicionar o Producer{}", e.getMessage());
        }
    }

    public static void delete(Integer id) {
        String sql = "DELETE FROM producer WHERE id = ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                log.info("Producer deletado com sucesso!");
            } else {
                log.error("Erro ao deletar o producer");
            }
        } catch (SQLException e) {
            log.error("Eror ao deletar o Producer{}", e.getMessage());
        }
    }
}