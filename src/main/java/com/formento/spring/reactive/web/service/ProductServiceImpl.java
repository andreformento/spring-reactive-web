package com.formento.spring.reactive.web.service;

import com.formento.spring.reactive.web.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Flux<Product> getAll() {
        return Flux.just(new Product(UUID.randomUUID(), "book"));
    }

}
