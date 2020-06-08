package com.learn.spring.guru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {

    @RequestMapping({"","/","index","/index.html"})
    public String vetList(){

        return "Vet/index";
    }

}
