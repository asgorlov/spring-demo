package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ango1019
 * Date: 29.06.2020
 * Time: 10:28
 */
@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello(
            @RequestParam(defaultValue = "World", required = false) String name,
            Model model) {
        model.addAttribute("user", name);
        return "hello";
    }
}