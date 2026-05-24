package com.turkcell.order_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public String get() {
        System.out.println("Hello OrderController");
        return "Hello OrderController";
    }
}
