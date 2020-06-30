package com.example.demo.controllers;

import com.example.demo.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ango1019
 * Date: 29.06.2020
 * Time: 14:22
 */
@RestController
public class HelloRestController {

    @GetMapping("/rest")
    public Greeting greet(@RequestParam(defaultValue = "World", required = false) String name) {
        return new Greeting(String.format("Hello, %s!", name));
    }
}