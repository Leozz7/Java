package com.jdbc.repository;

import com.jdbc.conn.Conexao;
import com.jdbc.listener.CustomRowSetListener;
import com.jdbc.model.Producer;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Log4j2
public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM producer WHERE nome LIKE ?";

        try (JdbcRowSet jrs = Conexao.getJDBCRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, "%"+name+"%");
            jrs.execute();

            while(jrs.next()) {
                producers.add(criarProducer(jrs.getInt("id"), jrs.getString("nome")));
            }
        } catch (SQLException e) {
            log.info(STR."Erro ao execular o comando\{e.getMessage()}");
        }
        return producers;
    }

    public static void updateJdbcRowsSet(Producer p) {
        String sql = "SELECT * FROM producer WHERE id = ?";
        try (JdbcRowSet jrs = Conexao.getJDBCRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, p.getId());
            jrs.execute();

            if (!jrs.next()) return;
            jrs.updateString("nome", p.getNome());
            jrs.updateRow();

        } catch (SQLException e) {
            log.info(STR."Erro ao executar o comando\{e.getMessage()}");
        }
    }

    public static void updateCashedRowsSet(Producer p) {
        String sql = "SELECT * FROM producer WHERE id = ?";
        try (CachedRowSet crs = Conexao.getCachedRowSet();
             Connection connection = Conexao.getConexao()){
            connection.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1, p.getId());
            crs.execute(connection);

            if (!crs.next()) return;
            crs.updateString("nome", p.getNome());
            crs.updateRow();
            TimeUnit.SECONDS.sleep(10);
            crs.acceptChanges();

        } catch (SQLException e) {
            log.info(STR."Erro ao executar o comando\{e.getMessage()}");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static Producer criarProducer(Integer id,String name) {
        return Producer.builder().id(id).nome(name).build();
    }
}
