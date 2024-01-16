package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
/*
GET http://localhost:8080/
 */
    @GetMapping()
    public String hello(){
        return "hola mundo";

}
}
