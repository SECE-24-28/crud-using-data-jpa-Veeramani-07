package com.example.firstAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/")
    public String greet(){
        return "vankam guyss";
    }

    @GetMapping("/about")
    public  String aboutus(){
        return "Its Jeeva";
    }

    @GetMapping("/about/contact")
    public  String contact(){
        return "Ph no :988278392";
    }

}
