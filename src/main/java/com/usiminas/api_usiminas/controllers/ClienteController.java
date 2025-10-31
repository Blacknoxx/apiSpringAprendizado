package com.usiminas.api_usiminas.controllers;

import com.usiminas.api_usiminas.entitis.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/cliente")
//path não é obrigatório
public class ClienteController {

    @GetMapping(path = "/qualquer")// indicar a instalação da extensão de json no Chrome
    public Cliente obterClient(){

        return new Cliente(28, "Pedro", "123.456.789-00");
    }

     @GetMapping(path = "/{id}")//desta forma posso passar valores variados
    public Cliente obterClientePorId01(@PathVariable int id){
        return new Cliente(id, "Jonas", "098.098.098-77");
    }//inserindo valores do browser para dentro do servidor
     //A notecion @PathVariable é que permite que a gente entre com um valor usando o browser

    @GetMapping
    public Cliente obterClientePorId02(@RequestParam(
            name = "id",
            defaultValue = "1") int id){
        return new Cliente(id, "João", "000.111.222-33");
    }


}
