package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "/lst")
    public String noteList(){
        return "test";
    }

    @GetMapping(value = "/chart")
    public String chart(){
        return "pic";
    }
}
