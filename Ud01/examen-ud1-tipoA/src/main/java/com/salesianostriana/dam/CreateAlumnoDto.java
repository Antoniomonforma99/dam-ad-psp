package com.salesianostriana.dam;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
public class CreateAlumnoDto {

    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private int notaFinal;
}
