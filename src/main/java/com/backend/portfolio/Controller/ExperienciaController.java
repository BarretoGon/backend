
package com.backend.portfolio.Controller;

import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfolio-firebase-auth-bd6f8.web.app")

@RestController
public class ExperienciaController {
     @Autowired
    private IExperienciaService interExperiencia;
    
    @GetMapping("/experiencias/traer")
    public List<Experiencia> getExperiencia(){
        return interExperiencia.getExperiencia();
    }
    
    @GetMapping("/experiencias/{id}")
    public Experiencia findExperiencia(@PathVariable Long id){
        return interExperiencia.findExperiencia(id);
    }
    
    @PostMapping("/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia expe){
        interExperiencia.saveExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/experiencias/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
    
    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                       @RequestBody Experiencia expe){
          expe.setId(id);
          interExperiencia.saveExperiencia(expe);
          return expe;
    }
}
