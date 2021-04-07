package com.utilities.controllers;

import com.utilities.domains.User;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloWorldController {

    @Get
    public User getHelloWorld() {
        return new User("alex", "simpson", "123456789", "me@email.com");
    }
}
