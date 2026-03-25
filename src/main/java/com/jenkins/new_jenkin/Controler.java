package com.jenkins.new_jenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @GetMapping("/home")
    public String home(){
        return "Computer#";
    }

}
