package com.learn.spring.guru.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"","/","index","/index.html"})
    public String ownerList(){

        return "Owner/index";
    }

}
