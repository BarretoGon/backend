
package com.backend.portfolio.Controller;

import com.backend.portfolio.model.Habilidad;
import com.backend.portfolio.service.IHabilidadService;
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
public class HabilidadController {
    @Autowired
    private IHabilidadService interHabilidad;
    
    @GetMapping("/habilidades/traer")
    public List<Habilidad> getHabilidad(){
        return interHabilidad.getHabilidad();
    }
    
    @GetMapping("/habilidades/{id}")
    public Habilidad findHabilidad(@PathVariable Long id){
        return interHabilidad.findHabilidad(id);
    }
    
    @PostMapping("/habilidades/crear")
    public String createHabilidad(@RequestBody Habilidad habi){
        interHabilidad.saveHabilidad(habi);
        return "La habilidades fue creada correctamente";
    }
    
    @DeleteMapping("/habilidades/borrar/{id}")
    public String deleteHabilidad (@PathVariable Long id){
        interHabilidad.deleteHabilidad(id);
        return "La habilidades fue eliminada correctamente";
    }
    
    @PutMapping("/habilidades/editar/{id}")
    public Habilidad editHabilidad(@PathVariable Long id,
                                   @RequestBody Habilidad habi){
          habi.setId(id);
          interHabilidad.saveHabilidad(habi);
          return habi;
    }
}
