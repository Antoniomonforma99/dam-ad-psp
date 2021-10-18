package com.monterogarcia.ud01ej02;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Data
@NoArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String codigoPais;

    private String pais;

    private String ciudad;

    private String loc;

    private String nombre;

    @Lob
    private String desc;

    private String urlImagen;

}
