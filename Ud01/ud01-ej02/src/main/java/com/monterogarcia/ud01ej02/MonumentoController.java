package com.monterogarcia.ud01ej02;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/monumento")
public class MonumentoController {

    private final Repository repository;

    @PostMapping("/")
    public ResponseEntity <Monumento> create (@RequestBody Monumento nuevo) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                //.status(201)
                .body(repository.save((nuevo)));
    }

    @GetMapping("/")
    public ResponseEntity<List<Monumento>> findAll(){
        return ResponseEntity
                .ok()
                .body(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monumento> findOne (@PathVariable("id") Long id) {
        return ResponseEntity
                .ok()
                .body(repository.findById(id).orElse(null));

        /*
        * return ResponseEntity
        *       .of(repository.findById(id);
        * */


    }

    @PutMapping("/{id}")
    public ResponseEntity<Monumento> edit (
            @RequestBody Monumento e,
            @PathVariable Long id) {

        return ResponseEntity.of(
                repository.findById(id).map( m -> {
                    m.setCiudad(e.getCiudad());
                    m.setDesc(e.getDesc());
                    m.setCodigoPais(e.getCodigoPais());
                    m.setLoc(e.getLoc());
                    m.setPais(e.getPais());
                    m.setUrlImagen(e.getUrlImagen());
                    m.setNombre(e.getNombre());

                    repository.save(m);

                    return m;
                })
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Monumento> delete () {

    }


}
