package com.usiminas.api_usiminas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MethodsController {

    @GetMapping
    public String get(){
        return "Teste chamada";
    }
    @PostMapping
    public String post(){
        return "Requisição post";
    }
    @PutMapping
    public String put(){
        return "Requisição put";
    }
    @PatchMapping
    public String patch(){
        return "Requisição patch";
    }
    @DeleteMapping
    public String delete(){
        return "Requisição delete";
    }
}
