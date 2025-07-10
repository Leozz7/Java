package com.crud.repository;

import com.crud.conexao.Conexao;
import com.crud.model.Anime;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Log4j2
public class AnimeRepository {
    public static void save(Anime a) {
        String sql = "INSERT INTO anime (nome, episodios, producer_id) VALUES (?, ?, ?)";
         try (Connection conn = Conexao.getConexao();
              PreparedStatement ps = conn.prepareStatement(sql)) {

             ps.setString(1, a.getNome());
             ps.setInt(2, a.getEpisodios());
             ps.setInt(3,a.getProducer().getId());

             if (ps.executeUpdate() > 0) {
                 log.info("O anime foi adicionado com sucesso");
             } else {
                 log.error("Erro ao adicionar o Anime" + a.getNome());
             }
         } catch (SQLException e) {
             log.error("Erro ao adicionar o anime" + e.getSQLState());
         }
    }
}
