package com.formento.spring.reactive.web.service;

import com.formento.spring.reactive.web.model.Album;
import reactor.core.publisher.Flux;

public interface AlbumService {

    Flux<Album> getAll();

}
