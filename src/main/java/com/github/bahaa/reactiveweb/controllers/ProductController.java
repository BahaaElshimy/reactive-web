package com.github.bahaa.reactiveweb.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

@RestController
@RequestMapping("api/v1/product")
@Slf4j
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public Flux<Product> listProducts(){
        return productService.listProducts();
    }

    @GetMapping("/{id}")
    public Mono<Product> getProductById(@PathVariable long id){
        return  productService.getProductById(id)
                .defaultIfEmpty(null)
                .doOnNext(p-> {
            if(p == null) throw new RuntimeException("Not found");
        });
    }

    @ExceptionHandler
    ResponseEntity handleException(RuntimeException runtimeException){
        return ResponseEntity.notFound().build();
    }

}
