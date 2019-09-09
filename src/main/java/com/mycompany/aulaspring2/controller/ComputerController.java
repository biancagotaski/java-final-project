package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.ComputerRepository;
import com.mycompany.aulaspring2.model.Computer;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Bianca
 */
@Controller
public class ComputerController {
    
    private ComputerRepository repository;
    
    public ComputerController(ComputerRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/computer")
    public String index(Model model) {
        
        List<Computer> computers = this.repository.findAll();
        
        model.addAttribute("computers", computers);
        return "/computer/index";
    }
    
    @RequestMapping("/computer/insert")
    public String insert(Model model){
        Computer c1 = new Computer();
        model.addAttribute("computer", c1);
        return "/computer/insert";
    }
    
    @RequestMapping(value = "/computer/insertAction", method = RequestMethod.POST)
    public String insertAction(@ModelAttribute("computer") Computer computer,
            BindingResult result,
            ModelMap model){
        if(result.hasErrors()){
            return "/computer/error";
        }
        model.addAttribute("computer", computer);
        return "/computer/visualization";
    }
}