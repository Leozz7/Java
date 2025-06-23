package com.jdbc.conn;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3307/anime_store";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }

    public static JdbcRowSet getJDBCRowSet() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(URL);
            jdbcRowSet.setUsername(USUARIO);
            jdbcRowSet.setPassword(SENHA);
            return jdbcRowSet;
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}