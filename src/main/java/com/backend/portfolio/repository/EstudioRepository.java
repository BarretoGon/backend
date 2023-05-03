
package com.backend.portfolio.repository;



import com.backend.portfolio.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long>{
    
}
