package com.github.bahaa.reactiveweb.controllers;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product ,Long> {
}
