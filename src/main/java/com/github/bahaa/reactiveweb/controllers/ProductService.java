package com.github.bahaa.reactiveweb.controllers;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Flux<Product> listProducts();
    Mono<Product> getProductById(long id);
}
