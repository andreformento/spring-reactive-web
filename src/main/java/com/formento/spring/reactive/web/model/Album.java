package com.formento.spring.reactive.web.model;

import java.io.Serializable;

public class Album implements Serializable {
    private final Integer year;
    private final String name;

    public Album() {
        this.year = 0;
        this.name = "";
    }

    public Album(Integer year, String name) {
        this.year = year;
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

}
