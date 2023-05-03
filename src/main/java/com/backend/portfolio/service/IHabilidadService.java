
package com.backend.portfolio.service;

import com.backend.portfolio.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
      
   public List<Habilidad> getHabilidad(); 
   
   public void saveHabilidad (Habilidad habi); 
   
   public void deleteHabilidad(Long id); 
   
   public Habilidad findHabilidad(Long id); 
}
