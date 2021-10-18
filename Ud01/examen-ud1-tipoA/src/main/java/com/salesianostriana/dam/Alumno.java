package com.salesianostriana.dam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Alumno {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private int notaFinal;


    public Alumno(String nombre, String apellido1, String apellido2, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.notaFinal = 0;
    }

    public Alumno(String nombre, String apellido1, String apellido2, String email, int notaFinal) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.notaFinal = notaFinal;
    }
}
