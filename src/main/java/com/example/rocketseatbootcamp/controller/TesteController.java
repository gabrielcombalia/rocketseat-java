package com.example.rocketseatbootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiraRota")
public class TesteController {


    /**
     *
     * Métotod de acesso ao HTTP
     *
     * GET - Buscar uma informação
     * POST - Adicionar um daao/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dado/informação
     * PATCH - Alterar somente uma parte  da info/dado
     *
     */

    //    Método/funcionalidade de uma classe
    @GetMapping("/primeiroMetodo")
    public String helloWorld() {
        return "Hello World!!!";
    }

}
