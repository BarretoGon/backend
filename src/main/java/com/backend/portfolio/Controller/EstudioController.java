



package com.backend.portfolio.Controller;


import com.backend.portfolio.model.Estudio;
import com.backend.portfolio.service.IEstudioService;
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
public class EstudioController {
    
     @Autowired
    private IEstudioService interEstudio;
  
     @GetMapping("/estudios/traer")
    public List<Estudio> getEstudio(){
        return interEstudio.getEstudio();
    }
    
     @GetMapping("/estudios/{id}")
    public Estudio findEstudio(@PathVariable Long id){
        return interEstudio.findEstudio(id);
    }
    
       @PostMapping("/estudios/crear")
    public String createEstudio(@RequestBody Estudio estu){
        interEstudio.saveEstudio(estu);
        return "La Estudio fue creada correctamente";
    }
    
    @DeleteMapping("/estudios/borrar/{id}")
    public String deleteEstudio (@PathVariable Long id){
        interEstudio.deleteEstudio(id);
        return "La Estudio fue eliminada correctamente";
    }
    
    @PutMapping("/estudios/editar/{id}")
    public Estudio editEstudio(@PathVariable Long id,
                               @RequestBody Estudio estu){
          estu.setId(id);
          interEstudio.saveEstudio(estu);
          return estu;
    }
}
