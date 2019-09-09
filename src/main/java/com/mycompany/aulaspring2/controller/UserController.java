/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aulaspring2.controller;

import com.mycompany.aulaspring2.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Bianca
 */
@Controller
public class UserController {
    
    @RequestMapping(value = "user/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            ModelMap modelMap) {
        
//        List<User> users = new ArrayList<User>();
//        users.add(new User("Bianca", "123"));
//        users.add(new User("Joana", "456"));
//        users.add(new User("Maria", "789"));
//        users.add(new User("admin", "admin"));
//        
//        for(User item : users){
//            if(item.getUsername().equalsIgnoreCase(username) && item.getPassword().equalsIgnoreCase(password)){
//                return "user/successful";
//            }
//        }
//        return "redirect:../?message="+"Login inválido!";
        
        if("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)){
            session.setAttribute("username", username);
            
            return "user/successful";
        } else {
            return "redirect:../?message="+"Login inválido!";
        }
    }
    
}
