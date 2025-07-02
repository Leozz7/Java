package com.crud.repository;

import com.crud.conexao.Conexao;
import com.crud.model.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepository {
    public static void save(Producer p) {
        String sql = "INSERT INTO producer (nome) VALUES (?)";
        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,p.getNome());

            if (ps.executeUpdate() > 0) {
                log.info("Producer adicionado com sucesso");
            } else {
                log.error("Erro ao adicionar o Producer");
            }
        } catch (Exception e) {
            log.error("Erro ao adicionar o producer:" + p.getNome());
        }
    }

    public static List<Producer> findByName(String name) {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer WHERE nome LIKE ?";
        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                producers.add(criarProducer(rs.getInt("id"), rs.getString("nome")));
            }
        } catch (SQLException e) {
            log.error("Erro ao pesquisar o nome: " + name);
        }
        return producers;
    }

    public static List<Producer> findAll() {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer";

        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                producers.add(criarProducer(rs.getInt("id"), rs.getString("nome")));
            }

        } catch (SQLException e) {
            log.error("Erro ao exibir todos os usuarios");
        }

        return producers;
    }

    public static void delete(Integer id) {
        String sql = "DELETE FROM producer WHERE (id = ?);";

        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                log.info("Producer excluido com sucesso");
            }
        } catch (Exception e) {
            log.error("Erro ao excluir Producer com id" + id);
        }
    }

    private static Producer criarProducer(int id,String name) {
        return Producer.builder().nome(name).id(id).build();
    }
}
