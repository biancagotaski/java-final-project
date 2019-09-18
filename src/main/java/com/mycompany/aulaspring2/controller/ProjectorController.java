package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.ProjectorRepository;
import com.mycompany.aulaspring2.model.Projector;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Bianca
 */
@Controller
public class ProjectorController {
    
    private ProjectorRepository repository;
    
    public ProjectorController(ProjectorRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/projector")
    public String page(Model model) {
        List<Projector> projectors = this.repository.findAll();
        
        model.addAttribute("projectors", projectors);
        return "/projector/index";
    }
    
}
