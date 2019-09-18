package com.mycompany.aulaspring2.dao;

import com.mycompany.aulaspring2.model.Projector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bianca
 */
@Repository
public interface ProjectorRepository extends JpaRepository<Projector, Integer>{
    
}
