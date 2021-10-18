package com.salesianostrian.ej01.services;

public class Saludar {

    private final Long id;
    private final String message;

    public Saludar(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage(){
        return message;
    }
}
