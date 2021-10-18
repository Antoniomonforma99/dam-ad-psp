package com.salesianostriana.dam;

public class Converter {

    public Alumno createAlumnoDtotoAlumno( CreateAlumnoDto a){
        return new Alumno(
                a.getNombre(),
                a.getApellido1(),
                a.getApellido2(),
                a.getEmail(),
                a.getNotaFinal()
        );

    }

    public GetAlumnoDto AlumnoToGetAlumnoDto (Alumno a) {
        GetAlumnoDto result = new GetAlumnoDto();

        result.setNombre(a.getNombre());
        result.setApellido1(a.getApellido1());
        result.setApellido2(a.getApellido2());
        result.setNotaFinal(a.getNotaFinal());

        return result;
    }
}
