package com.example.flutterweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/getHelloMsg")
    public String getHelloMsg(){
        return "Hello From Backend!";
    }
}
