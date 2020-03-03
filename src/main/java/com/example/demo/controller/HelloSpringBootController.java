package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloSpringBootController.
 */
@Controller
public class HelloSpringBootController {
    /**
     * Returns index page.
     * 
     * @param model is model class
     */
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello Springboot");
        return "index";
    }
}