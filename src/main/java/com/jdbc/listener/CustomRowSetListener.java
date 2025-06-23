package com.jdbc.listener;

import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

@Log4j2
public class CustomRowSetListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Comando execute ativado");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Alteração feita");

        if (event.getSource() instanceof RowSet rowSet) {
            try {
                rowSet.execute();
            } catch (SQLException e) {
                log.error("Erro ao executar o RowSet após alteração", e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("O cursor se move");
    }
}
