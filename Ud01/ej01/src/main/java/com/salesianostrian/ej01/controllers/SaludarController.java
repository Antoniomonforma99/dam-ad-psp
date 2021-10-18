package com.salesianostrian.ej01.controllers;


import com.salesianostrian.ej01.services.Saludar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludarController {

    private static final String template = "Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/saludo")
    public Saludar saludo(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Saludar(counter.incrementAndGet(), String.format(template, name));
    }
}
