package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author ango1019
 * Date: 29.06.2020
 * Time: 13:46
 */
public class HelloControllerUnitTest {

    @Test
    public void sayHello() {
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("World", model);

        assertEquals("hello", result);
        assertEquals("World", model.asMap().get("user"));
    }
}