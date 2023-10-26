package com.example.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.SQLException;

@SpringBootApplication
public class DaoApplication {

    public DaoApplication() throws SQLException {
    }

    public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class, args);
    }
}
