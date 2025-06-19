package com.jdbc.repository;

import com.jdbc.conn.Conexao;
import com.jdbc.model.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public static void update(Producer p) {
        String sql = "UPDATE producer SET nome = ? WHERE id = ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getNome());
            ps.setInt(2, p.getId());

            if (ps.executeUpdate() > 0) {
                log.info("Producer atualizado com sucesso!");
            } else {
                log.error("Erro ao atualizar o producer");
            }
        } catch (SQLException e) {
            log.error("Eror ao atualizar o Producer{}", e.getMessage());
        }
    }

    public static List<Producer> findAll() {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer";

        try (Connection conn = Conexao.getConexao();
             Statement ps = conn.createStatement();
             ResultSet rs = ps.executeQuery(sql)) {
        while (rs.next()) {
         producers.add(Producer.builder()
                 .id(rs.getInt("id"))
                 .nome(rs.getString("nome"))
                 .build());
        }
        } catch (SQLException e) {
            log.error("Eror ao buscar o Producer{}", e.getMessage());
        }
        return producers;
    }

    public static List<Producer> findName(String name) {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer WHERE nome LIKE ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                producers.add(Producer.builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .build());
            }
        } catch (SQLException e) {
            log.error("Eror ao buscar o Producer{}", e.getMessage());
        }
        return producers;
    }


}