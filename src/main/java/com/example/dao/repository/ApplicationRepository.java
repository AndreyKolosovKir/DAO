package com.example.dao.repository;

import com.example.dao.collectionProducts.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ApplicationRepository {

    private final String pathScript = "myScript.sql";

    private int id = 0;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public String getProductName(String name) throws SQLException {
        String script = readScript(pathScript);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", name);

        List<Product> products = namedParameterJdbcTemplate.query(script, parameters, (ResultSet rs, int rowNum) -> {
            if (rs.getString("product_name") != null) {
                id += 1;
            }
            String productName = rs.getString("product_name");
            return new Product(id, productName);
        });
        return products.toString();
    }

    private static String readScript(String pathScript) {
        try (InputStream is = new ClassPathResource(pathScript).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
