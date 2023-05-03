
package com.backend.portfolio.service;


import com.backend.portfolio.model.Estudio;
import java.util.List;


public interface IEstudioService {
    
     
   public List<Estudio> getEstudio(); 
   
   public void saveEstudio (Estudio estu); 
   
   public void deleteEstudio(Long id); 
   
   public Estudio findEstudio(Long id); 
}
