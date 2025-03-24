package com.daval.curso.sprigboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.daval.curso.sprigboot.webapp.springboot_web.models.User;
import com.daval.curso.sprigboot.webapp.springboot_web.models.UserDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {

    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/details")
    public UserDto details() {
        User user = new User("David", "Valero");
        UserDto userDto = new UserDto();
        userDto.setTitle("Hola mundo spring boot");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("David", "Valero");
        Map<String, Object> body = new HashMap<>() ;
        body.put("title", "Hola mundo spring boot");
        body.put("user", user);
        return body;
    }

}
