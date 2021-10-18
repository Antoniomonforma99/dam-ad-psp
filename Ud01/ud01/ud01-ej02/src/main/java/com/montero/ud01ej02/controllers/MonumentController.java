package com.montero.ud01ej02.controllers;

import com.montero.ud01ej02.models.Monument;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MonumentController {

    private final AtomicLong counterId = new AtomicLong();

    @GetMapping("/monument")
    public Monument monument
}
