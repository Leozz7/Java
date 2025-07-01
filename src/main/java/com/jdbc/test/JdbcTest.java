package com.jdbc.test;

import com.jdbc.model.Producer;
import com.jdbc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class JdbcTest {
    public static void main(String[] args) {
        //ProducerRepositoryRowSet.findByNameJdbcRowSet("Leandro").forEach(System.out::println);
        //ProducerRepositoryRowSet.updateJdbcRowsSet(Producer.builder().id(1).nome("Leandro").build());
        //ProducerRepositoryRowSet.findByNameJdbcRowSet("").forEach(System.out::println);
        ProducerRepositoryRowSet.updateCashedRowsSet(Producer.builder().id(1).nome("Leandro").build());

    }
}
