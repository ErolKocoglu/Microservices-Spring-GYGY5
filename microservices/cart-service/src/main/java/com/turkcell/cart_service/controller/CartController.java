package com.turkcell.cart_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/carts")
public class CartController {

    @GetMapping
    public String get() {
        System.out.println("Hello CartController");
        return "Hello CartController";
    }
}
