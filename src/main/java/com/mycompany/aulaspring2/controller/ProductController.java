package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.dao.ProductRepository;
import com.mycompany.aulaspring2.model.Product;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Bianca
 */
@Controller
public class ProductController {
    
    private ProductRepository repository;
    
    public ProductController(ProductRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/product")
    public String index(Model model) {
        
        List<Product> products = this.repository.findAll();
        
        model.addAttribute("products", products);
        return "product/index";
    }
}
