package com.turkcell.notification_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @GetMapping
    public String get() {
        System.out.println("Hello NotificationController");
        return "Hello NotificationController";
    }
}
