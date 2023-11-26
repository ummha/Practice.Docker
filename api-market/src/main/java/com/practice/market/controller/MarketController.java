package com.practice.market.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MarketController {
    private final HttpServletRequest servletRequest;

    @GetMapping("")
    String market() {
        log.info("REQUEST :: request:url:{}", servletRequest.getRequestURL());
        return "This is my market!";
    }
}
