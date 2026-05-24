package com.turkcell.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/products")
@RestController
public class ProductController {

    @GetMapping
    public String get() {
        System.out.println("Hello ProductController");
        return "Hello ProductController";
    }
}
