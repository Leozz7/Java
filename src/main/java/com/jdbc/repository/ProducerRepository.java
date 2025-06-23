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

    public static void deletebyName(String name) {
        String sql = "DELETE FROM producer WHERE nome LIKE ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%"+name+"%");

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
            producers.add(criarProducer(rs.getInt("id"), rs.getString("nome")));
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
                producers.add(criarProducer(rs.getInt("id"), rs.getString("nome")));
            }
        } catch (SQLException e) {
            log.error("Eror ao buscar o Producer{}", e.getMessage());
        }
        return producers;
    }

    public static void showMetaData() {
        String sql = "SELECT * FROM producer";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();

            int column = rm.getColumnCount();
            log.info("Quantidade de colunas: '{}'", column);
            for (int i = 1; i <= column; i++) {
                log.info("Nome da Tabela: '{}'", rm.getTableName(i));
                log.info("Nome da Coluna: '{}'", rm.getColumnName(i));
                log.info("Tamanho da Coluna: '{}'", rm.getColumnDisplaySize(i));
                log.info("Tipo da Coluna: '{}'", rm.getColumnType(i));
            }
        } catch (SQLException e) {
            log.error("Erro ao buscar o os dados{}", e.getMessage());
        }
    }

    public static void showDriverMetaData() {

        try (Connection conn = Conexao.getConexao()){
            DatabaseMetaData dt = conn.getMetaData();

            if (dt.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suporta TYPE_FORWARD_ONLY");
                if (dt.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {
                    log.info("Suporta CONCUR_READ_ONLY");
                }
            }

            if (dt.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suporta TYPE_FORWARD_ONLY");
                if (dt.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                    log.info("Suporta TYPE_SCROLL_INSENSITIVE");
                }
            }

            if (dt.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suporta TYPE_FORWARD_ONLY");
                if (dt.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE)) {
                    log.info("Suporta TYPE_SCROLL_SENSITIVE");
                }
            }

            if (dt.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suporta TYPE_FORWARD_ONLY");
                if (dt.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Suporta CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Erro ao buscar os dados do Diver{}", e.getMessage());
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM producer;";

        try (Connection conn = Conexao.getConexao();
             Statement ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = ps.executeQuery(sql);
            log.info("Primeira linha? '{}'", rs.first());
            log.info("Numero da Linha '{}'", rs.getRow());
            log.info(criarProducer(rs.getInt("id"), rs.getString("nome")));

            log.info("Ultima linha? '{}'", rs.last());
            log.info("Numero da Ultima linha '{}'", rs.getRow());
            log.info(criarProducer(rs.getInt("id"), rs.getString("nome")));

        } catch (SQLException e) {
            log.error("Eror ao exbir linha{}", e.getMessage());
        }
    }

    public static List<Producer> findAllUpperCase() {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer";

        try (Connection conn = Conexao.getConexao();
             Statement ps = conn.createStatement();
             ResultSet rs = ps.executeQuery(sql)) {
            while (rs.next()) {
                producers.add(criarProducer(rs.getInt("id"), rs.getString("nome").toUpperCase()));
            }
        } catch (SQLException e) {
            log.error("Error ao buscar o Producer{}", e.getMessage());
        }
        return producers;
    }

    public static List<Producer> findNameAndUpdateToUpperCase(String name) {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer WHERE nome LIKE '%%%s%%'"
                .formatted(name);

        try (Connection conn = Conexao.getConexao();
             Statement ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = ps.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
                rs.updateRow();
                producers.add(criarProducer(rs.getInt("id"), rs.getString("nome")));
            }
        } catch (SQLException e) {
            log.error("Eror ao buscar e atualizar o Producer{}", e.getMessage());
        }
        return producers;
    }

    public static List<Producer> findNameAndInsertRow(String name) {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer WHERE nome LIKE ?";
        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ps.setString(1, "%" + name + "%");

            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    found = true;
                    producers.add(criarProducer(rs.getInt("id"), rs.getString("nome")));
                }
                if (!found) {
                    rs.moveToInsertRow();
                    rs.updateString("nome", name);
                    rs.insertRow();
                    rs.last();
                    producers.add(criarProducer(rs.getInt("id"), rs.getString("nome")));
                }
            }
        } catch (SQLException e) {
            log.error("Erro ao buscar e inserir o Producer: {}", e.getMessage());
        }
        return producers;
    }


    private static Producer criarProducer(Integer id, String nome) {
        return Producer.builder()
                .id(id)
                .nome(nome)
                .build();
    }
}