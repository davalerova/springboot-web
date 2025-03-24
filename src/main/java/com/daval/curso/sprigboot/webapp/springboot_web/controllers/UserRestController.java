package com.daval.curso.sprigboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("David", "Valero");
        User user2 = new User("Andrés", "Vanegas");
        User user3 = new User("Jhon", "Doe");
        // 1) List<User> users = List.of(user, user2, user3);
        // 2) List<User> users = Arrays.asList(user, user2, user3);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        return users;
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
