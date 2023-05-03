/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.Controller;

import com.backend.portfolio.model.Proyecto;
import com.backend.portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto> getProyecto(){
        return interProyecto.getProyecto();
    }
    
    @GetMapping("/proyectos/{id}")
    public Proyecto findProyecto(@PathVariable Long id){
        return interProyecto.findProyecto(id);
    }
    
    @PostMapping("/proyectos/crear")
    public String createProyecto(@RequestBody Proyecto pro){
        interProyecto.saveProyecto(pro);
        return "La proyectos fue creada correctamente";
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyecto (@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        return "La proyectos fue eliminada correctamente";
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                                 @RequestBody Proyecto pro){
          pro.setId(id);
          interProyecto.saveProyecto(pro);
          return pro;
    }
    
}
