package com.mycompany.aulaspring2.dao;

import com.mycompany.aulaspring2.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bianca
 */
@Repository
public interface ComputerRepository extends JpaRepository<Computer, Integer>{
    
}
