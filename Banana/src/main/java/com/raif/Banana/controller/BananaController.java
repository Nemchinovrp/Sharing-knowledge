package com.raif.Banana.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class BananaController {
    private final JdbcTemplate jdbcTemplate;

    @GetMapping("banana")
    public String test() {
        return "banana";
    }

    @GetMapping("connect")
    public String connection() throws SQLException {
        Connection connection = jdbcTemplate.getDataSource().getConnection();
        String catalog = connection.getCatalog();
        connection.close();
        return catalog;
    }
}
