package com.learn.spring.guru.controllers;

import com.learn.spring.guru.service.OwnerService;
import com.learn.spring.guru.service.VetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/owners")
public class OwnerController {
    private final OwnerService ownerService;


    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","index","/index.html"})
    public String ownerList(Model model){

    model.addAttribute("owners",ownerService.findAll());

        return "Owner/index";
    }

}
