
package com.backend.portfolio.service;

import com.backend.portfolio.repository.HabilidadRepository;
import com.backend.portfolio.model.Habilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService  implements IHabilidadService{
     @Autowired
    private HabilidadRepository habiRepository;
    
    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> listaHabilidad = habiRepository.findAll();
        return listaHabilidad;
    }

    @Override
    public void saveHabilidad(Habilidad habi) {
        habiRepository.save(habi);
    }

    @Override
    public void deleteHabilidad(Long id) {
        habiRepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        Habilidad habi = habiRepository.findById(id).orElse(null);
        return habi;
    }
}
