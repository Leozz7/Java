package com.crud.repository;

import com.crud.conexao.Conexao;
import com.crud.model.Anime;
import com.crud.model.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Anime> findAll() {
        String sql = "SELECT * FROM anime";

        List<Anime> animes = new ArrayList<>();

        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                animes.add(criarAnime(rs.getInt("id"), rs.getString("nome"), rs.getInt("episodios"), ProducerRepository.findById(rs.getInt("producer_id"))));
            }
        } catch (SQLException e) {
            log.error("Erro ao exibir todos os Animes");
        }

        return animes;
    }

    public static List<Anime> findByName(String name) {
        String sql = "SELECT * FROM anime WHERE nome LIKE ?";

        List<Anime> animes = new ArrayList<>();

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, STR."%\{name}%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                animes.add(criarAnime(rs.getInt("id"), rs.getString("nome"), rs.getInt("episodios"), ProducerRepository.findById(rs.getInt("producer_id"))));
            }
        } catch (SQLException e) {
            log.error("Erro ao exibir o Animes: " + name);
        }

        return animes;
    }

    public static Anime findById(Integer id) {
        String sql = "SELECT * FROM anime WHERE id = ?";

        Anime anime = null;

        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1 , id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                anime = criarAnime(rs.getInt("id"), rs.getString("nome"), rs.getInt("episodios"), ProducerRepository.findById(rs.getInt("producer_id")));
            }

        } catch (SQLException e) {
            log.error("Erro ao exibir o Anime do id: " + id);
        }
        return anime;
    }

    public static void update(Integer id, String parametro,Anime a) {
        String sql = "UPDATE producer SET " + parametro + " = ? WHERE id = ?";

        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {

            switch (parametro) {
                case "nome": ps.setString(1, a.getNome());
                break;

                case "episodios": ps.setInt(1, a.getEpisodios());
                break;

                case "producer": ps.setInt(1, a.getProducer().getId());
            }

            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            log.error("Erro ao atualizar o id:" + id);
        }
    }

    public static void delete(Integer id) {
        String sql = "DELETE FROM anime WHERE id = ?";

        try (Connection conn = Conexao.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                log.info("Anime deletado com sucesso");
            } else {
                log.error("Erro ao deletar o anime");
            }
        } catch (SQLException e) {
            log.error("Erro ao executar query");
        }
    }

    public static Anime criarAnime(Integer id, String nome, Integer episodios, Producer p) {
        return Anime.builder().id(id).nome(nome).episodios(episodios).producer(p).build();
    }
}
