/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.model.Loan;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
public class LoanController {
    
    @RequestMapping("/loan")
    public String index(Model model) {
        
        ArrayList<Loan> loans = new ArrayList<Loan>();
        
        Loan l1 = new Loan();
        l1.setEndDate(LocalDateTime.now());
        l1.setStartDate(LocalDateTime.now());
        l1.setCpfCustomer("16159777750");        
        
        loans.add(l1);
        
        model.addAttribute("loan", loans);
        return "/loan/index";
    }
    
    @RequestMapping("/loan/insert")
    public String insert(Model model){
        Loan loan = new Loan();
        model.addAttribute("loan", loan);
        return "/loan/insert";
    }
    
    @RequestMapping(value = "/loan/insertAction", method = RequestMethod.POST)
    public String insertAction(
            @ModelAttribute("loan") Loan loan, 
            BindingResult result, 
            ModelMap model){
        if(result.hasErrors()){
            return "/loan/error/";
        }
        model.addAttribute("loan", loan);
        return "/loan/visualization";
    }
}
