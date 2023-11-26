package com.practice.delivery.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DeliveryController {
    private final HttpServletRequest servletRequest;

    @GetMapping("")
    String delivery() {
        log.info("REQUEST :: request:url:{}", servletRequest.getRequestURL());
        return "Deliver Soon!";
    }
}
