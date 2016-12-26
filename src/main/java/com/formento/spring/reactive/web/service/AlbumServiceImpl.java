package com.formento.spring.reactive.web.service;

import com.formento.spring.reactive.web.model.Album;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Override
    public Flux<Album> getAll() {
        return Flux.just(
                new Album(1980, "Iron Maiden"),
                new Album(2015, "The Book of Souls")
        );
    }

}

