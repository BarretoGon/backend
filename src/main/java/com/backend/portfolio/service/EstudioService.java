
package com.backend.portfolio.service;

import com.backend.portfolio.model.Estudio;
import com.backend.portfolio.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudioService  implements IEstudioService{
     @Autowired
    private EstudioRepository estuRepository;

    @Override
    public List<Estudio> getEstudio() {
        List<Estudio> listaEstudio = estuRepository.findAll();
        return listaEstudio;    
    }

    @Override
    public void saveEstudio(Estudio estu) {
        estuRepository.save(estu);   
    }

    @Override
    public void deleteEstudio(Long id) {
        estuRepository.deleteById(id);
    }

    @Override
    public Estudio findEstudio(Long id) {
        Estudio estu = estuRepository.findById(id).orElse(null);
        return estu;
    }
    
    
}
