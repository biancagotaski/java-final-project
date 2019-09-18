package com.mycompany.aulaspring2.dao;

import com.mycompany.aulaspring2.model.Product;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bianca
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
//    @Query("from product p where p.loans.id = ?")
//    public Set<Product> findAllByLoanId(int loan_id);
}
