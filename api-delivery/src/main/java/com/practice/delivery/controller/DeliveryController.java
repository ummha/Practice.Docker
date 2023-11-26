package com.practice.delivery.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

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

    @GetMapping("/session")
    ResponseEntity<Map<String, Object>> session() {
        HttpSession httpSession = servletRequest.getSession();

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("id", httpSession.getId());
        body.put("createdBy", httpSession.getAttribute("createdBy"));
        body.put("modifiedBy", httpSession.getAttribute("modifiedBy"));
        return ResponseEntity.ok(body);
    }

    @PutMapping("/session")
    ResponseEntity<Map<String, Object>> updateSession() {
        HttpSession httpSession = servletRequest.getSession();
        if(httpSession.getAttribute("createdBy") == null) {
            httpSession.setAttribute("createdBy", "delivery");
        }
        httpSession.setAttribute("modifiedBy", "delivery");

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("id", httpSession.getId());
        return ResponseEntity.ok(body);
    }

    @PostMapping("/session")
    ResponseEntity<Map<String, Object>> createSession() {
        HttpSession httpSession = servletRequest.getSession();
        httpSession.setAttribute("createdBy", "delivery");
        httpSession.setAttribute("modifiedBy", "delivery");

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("id", httpSession.getId());
        return ResponseEntity.ok(body);
    }
}
