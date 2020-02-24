package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloSpringBootController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello Springboot");
        return "index";
    }
}