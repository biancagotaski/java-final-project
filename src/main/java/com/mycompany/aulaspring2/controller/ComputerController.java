package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.model.Computer;
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
    
    @RequestMapping("/computer")
    public String page(Model model) {
        
        Computer comp1 = new Computer();        
        model.addAttribute("computer", comp1);
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