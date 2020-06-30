package com.example.demo.entity;

/**
 * @author ango1019
 * Date: 29.06.2020
 * Time: 14:26
 */
public class Greeting {
    private String message;

    public Greeting() {}

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}