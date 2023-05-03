/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
        
   public List<Proyecto> getProyecto(); 
   
   public void saveProyecto (Proyecto pro); 
   
   public void deleteProyecto(Long id); 
   
   public Proyecto findProyecto(Long id); 
}
