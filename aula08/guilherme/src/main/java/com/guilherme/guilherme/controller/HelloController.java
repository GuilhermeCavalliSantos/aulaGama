package com.guilherme.guilherme.controller;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")

public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> ola(){

        return ResponseEntity.ok ("Olá mundo");
       // return ResponseEntity.notFound().build();
    }


    public String ola2(){
        return "Olá Mundo!";
    }
    
    @GetMapping("/positivo/{numero}")
    public ResponseEntity<String> isPositive(@PathVariable int numero) {
        if (numero>=0){
            return ResponseEntity.ok("É positivo");
        }else{
            return ResponseEntity.ok ("É negativo");
        }
    }
    
}
