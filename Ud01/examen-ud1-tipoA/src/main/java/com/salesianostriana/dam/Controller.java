package com.salesianostriana.dam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alumno")
public class Controller {

    private AlumnoRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> findAll () {
        if (repository.findAll().isEmpty()) {
            return ResponseEntity
                    .noContent()
                    .build();
        } else {
            List <Alumno> alumnos = repository.findAll().stream().collect(Collectors.toList());
            return ResponseEntity
                    .ok()
                    .body(alumnos);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Alumno> create (@RequestBody CreateAlumnoDto dto) {
        if (dto.getApellido1() == null
                || dto.getApellido2() == null
                || dto.getNombre() == null) {
            return ResponseEntity
                    .badRequest()
                    .build();
        } else {

        }
    }

    @PutMapping("/{id}/nota/{nota}")
    public ResponseEntity<Alumno> edit (@RequestBody Alumno a,
                                        @RequestBody Integer nota,
                                        @PathVariable Long id) {

        if (a.getNotaFinal() < 0 || a.getNotaFinal() > 10) {
            return ResponseEntity
                    .badRequest()
                    .build();
        } else if (!repository.existsById(id)) {
            return ResponseEntity
                    .notFound()
                    .build();
        } else {
            return ResponseEntity.of(repository.findById(id).map(c -> {
                c.setNombre(a.getNombre());
                c.setApellido1(a.getApellido1());
                c.setApellido2(a.getApellido2());
                c.setNotaFinal(nota);

                repository.save(c);
                return c;
            }));
        }


    }
}
