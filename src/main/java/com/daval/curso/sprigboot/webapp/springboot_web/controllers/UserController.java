package com.daval.curso.sprigboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.daval.curso.sprigboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("David", "Valero");
        // user.setEmail("dvdovni@gmail.com");
        model.addAttribute("title", "Hola mundo spring boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        User user = new User("David", "Valero");
        User user2 = new User("Andrés", "Vanegas");
        User user3 = new User("Jhon", "Doe");
        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("users", new User[] { user, user2, user3 });
        return "list";
    }

}
