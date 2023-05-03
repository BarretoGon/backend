
package com.backend.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   private String nombre;
   private String descripcion;
   private String link;
}
