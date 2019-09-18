package com.mycompany.aulaspring2.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Bianca
 */
@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request) {
        String message = request.getParameter("message");
        model.addAttribute("message", message);
        return "index";
    }
    
}
