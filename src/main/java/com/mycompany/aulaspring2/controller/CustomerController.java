package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.CustomerRepository;
import com.mycompany.aulaspring2.model.Customer;
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
public class CustomerController {
    
    private CustomerRepository repository;
    
    public CustomerController(CustomerRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/customer")
    public String index(Model model) {
        
        List<Customer> customers = this.repository.findAll();
        
        model.addAttribute("customers", customers);
        return "/customer/index";
    }
    
    @RequestMapping("/customer/insert")
    public String insert(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "/customer/insert";
    }
    
    @RequestMapping(value = "/customer/insertAction", method = RequestMethod.POST)
    public String insertAction(@ModelAttribute("customer") Customer customer,
            BindingResult result,
            ModelMap model){
        if(result.hasErrors()){
            return "error";
        }
//        model.addAttribute("customer", customer);
//        return "/customer/visualize";
        this.repository.save(customer);
        model.addAttribute("customers", this.repository.findAll());
        model.addAttribute("message", "Salvo com sucesso!");
        
        return "/customer/index";
    }
    
    
}
