
package com.backend.portfolio.Controller;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.service.IPersonaService;
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

@CrossOrigin(origins = "https://portfolio-firebase-auth-bd6f8.web.app")

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
       
    }
    
    @PostMapping ("/personas/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        
        return "La persona fue creada correctamente";
        
    }
    
    
    
    
    
    @DeleteMapping ("/personas/borrar/{id}")
     public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        
        return "La persona fue eliminada correctamente";       
    }
     
    @PutMapping ("personas/editar/{id}")
   
     public Persona editPersona(@PathVariable Long id,
                               @RequestBody Persona perso){
          perso.setId(id);
          interPersona.savePersona(perso);
          return perso;
    }
    
}
