package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.PrinterRepository;
import com.mycompany.aulaspring2.model.Printer;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Bianca
 */
@Controller
public class PrinterController {
    
    private PrinterRepository repository;
    
    public PrinterController(PrinterRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/printer")
    public String page(Model model) {
        List<Printer> printers = this.repository.findAll();
        
        model.addAttribute("printers", printers);
        return "/printer/index";
    }
    
}
