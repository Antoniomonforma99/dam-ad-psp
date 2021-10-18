package com.salesianostriana.dam;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAlumnoDto {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer notaFinal;
}
