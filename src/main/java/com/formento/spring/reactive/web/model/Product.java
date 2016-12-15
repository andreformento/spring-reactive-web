package com.formento.spring.reactive.web.model;

import java.io.Serializable;
import java.util.UUID;

public class Product implements Serializable {
    private UUID id;
    private String name;

    public Product() {
    }

    public Product(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
