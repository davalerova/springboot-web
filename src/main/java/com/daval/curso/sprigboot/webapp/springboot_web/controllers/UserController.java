package com.daval.curso.sprigboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.daval.curso.sprigboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("David", "Valero");
        model.addAttribute("title", "Hola mundo spring boot");
        model.addAttribute("user", user);
        return "details";
    }

}
