
package com.backend.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private Long edad;
   private String domicilio;
    private String fechaNac;
     private Long telefono;
    private String correo;
     private String titulo;
    private String sobre_mi;
    private String url_foto;
  
   
 
}
