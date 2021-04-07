package com.utilities.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloWorldController {

    @Get
    public String getHelloWorld() {
        return "Hello World!";
    }
}
