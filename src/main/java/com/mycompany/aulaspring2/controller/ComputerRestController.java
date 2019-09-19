package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.ComputerRepository;
import com.mycompany.aulaspring2.model.Computer;
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
@RequestMapping("/rest/computer")
public class ComputerRestController {
    
    private ComputerRepository repository;
    
    public ComputerRestController(ComputerRepository repository){
        this.repository = repository;
    }
    
    @GetMapping()
    public List<Computer> list(){
        return this.repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable int id){
        Optional<Computer> computer = this.repository.findById(id);
        if(computer.isPresent()){
            return new ResponseEntity<>(computer.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public Computer post(@RequestBody Computer computer){
        return this.repository.save(computer);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        Optional<Computer> computer = this.repository.findById(id);
        if(computer.isPresent()){
            this.repository.delete(computer.get());
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable int id, 
                                 @RequestBody Computer newComputer){
        
       Optional<Computer> oldComputer = this.repository.findById(id);
       if(oldComputer.isPresent()){
           newComputer.setId(id);
           this.repository.save(newComputer);
           return new ResponseEntity<>(newComputer, HttpStatus.OK);
       }else{
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
        
    }
}
