package com.practice.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @GetMapping("/delivery")
    String delivery() {
        return "Deliver Soon!";
    }
}
