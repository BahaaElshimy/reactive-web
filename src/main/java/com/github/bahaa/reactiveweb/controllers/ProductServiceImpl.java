package com.github.bahaa.reactiveweb.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Flux<Product> listProducts() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> getProductById(long id) {
        return productRepository.findById(id);
    }
}
