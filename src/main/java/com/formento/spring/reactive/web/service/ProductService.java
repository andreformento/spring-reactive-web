package com.formento.spring.reactive.web.service;

import com.formento.spring.reactive.web.model.Product;
import reactor.core.publisher.Flux;

public interface ProductService {

    Flux<Product> getAll();

}
