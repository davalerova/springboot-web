package com.daval.curso.sprigboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
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
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>() ;
        body.put("title", "Hola mundo spring boot");
        body.put("name", "David");
        body.put("lastname", "Valero");
        return body;
    }

}
