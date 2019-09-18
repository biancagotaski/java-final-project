package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.CustomerRepository;
import com.mycompany.aulaspring2.model.Customer;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        
        this.repository.save(customer);
        model.addAttribute("customers", this.repository.findAll());
        model.addAttribute("message", "Salvo com sucesso!");
        
        return "/customer/index";
    }
    
    @RequestMapping("/customer/update/{id}")
    public String update(Model model,
            @PathVariable(value="id") int id){
        
        Optional<Customer> customer = this.repository.findById(id);
        model.addAttribute("customer", customer.get());
        return "customer/update";
    }
    
    @RequestMapping(value = "/customer/updateAction", method = RequestMethod.POST)
    public String updateAction(@ModelAttribute("customer") Customer customer,
            BindingResult result,
            ModelMap model){
        
        if(result.hasErrors()){
            return "error";
        }
        
        this.repository.save(customer);
        model.addAttribute("message", "Alterações salvas!");
        model.addAttribute("customers", this.repository.findAll());
        return "customer/index";
    }
    
    @RequestMapping("/customer/remove/{id}")
    public String remove(Model model,
            @PathVariable(value="id") int id){
        
        this.repository.deleteById(id);
        model.addAttribute("message", "Cliente removido!");
        model.addAttribute("customers", this.repository.findAll());
        return "/customer/index";
    }
}
