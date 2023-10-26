package com.example.dao.controller;

import com.example.dao.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class ApplicationController {

    @Autowired
    ApplicationRepository applicationRepository;

    @GetMapping("/products/fetch-product")
    public String getName(@RequestParam("name") String name) throws SQLException {
        return applicationRepository.getProductName(name);
    }
}
