package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.LoanRepository;
import com.mycompany.aulaspring2.model.Loan;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bianca
 */
@RestController
@RequestMapping("/rest/loan")
public class LoanRestController {
    
    private LoanRepository repository;
    
    public LoanRestController(LoanRepository repository){
        this.repository = repository;
    }
    
    @GetMapping()
    public List<Loan> list(){
        return this.repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable int id){
        Optional<Loan> loan = this.repository.findById(id);
        
        if(loan.isPresent()){
            return new ResponseEntity<>(loan.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public Loan post(@RequestBody Loan loan){
        return this.repository.save(loan);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        Optional<Loan> loan = this.repository.findById(id);
        if(loan.isPresent()){
            this.repository.delete(loan.get());
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable int id,
            @RequestBody Loan newLoan){
        Optional<Loan> oldLoan = this.repository.findById(id);
        if(oldLoan.isPresent()){
            newLoan.setId(id);
            this.repository.save(newLoan);
            return new ResponseEntity<>(newLoan, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
