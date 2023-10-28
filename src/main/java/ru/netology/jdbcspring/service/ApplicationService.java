package ru.netology.jdbcspring.service;

import org.springframework.stereotype.Service;
import ru.netology.jdbcspring.repository.ApplicationRepository;

import java.util.List;

@Service
public class ApplicationService {
    ApplicationRepository repository;

    public ApplicationService(ApplicationRepository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}
