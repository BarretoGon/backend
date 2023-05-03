package com.backend.portfolio.service;

import com.backend.portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {

   public List<Experiencia> getExperiencia(); 
   
   public void saveExperiencia (Experiencia expe); 
   
   public void deleteExperiencia(Long id); 
   
   public Experiencia findExperiencia(Long id); 
}