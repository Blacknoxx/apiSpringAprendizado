package com.usiminas.api_usiminas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimServerController {

    @RequestMapping(method = RequestMethod.GET, path = "/ola")
    public String ola() {
        return "Ola Senhor Spring!!";
    }
    //testar aqui com o metodo post
    @GetMapping(path = "/ag")//sendo mais especifico usamos @Getmapping
    public String ola1() {
        return "Ola Senhor Spring! - againagain!";
    }

    @GetMapping(path = {"/again", "/main"})//posso criar um array de URL se quiser
    public String ola2() {                 //CTRL+F9
        return "Ola Senhor Spring! - Arroz com Arroz pra depois!";
    //Testar erro da URL duplicada: , "/ola"
    //Testar erro da URL duplicada: , "/ola", usando metodo @PostMapping no lugar de GetMapping
    }
}