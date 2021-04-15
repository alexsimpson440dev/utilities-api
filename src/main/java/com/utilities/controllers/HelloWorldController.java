package com.utilities.controllers;

import com.utilities.domains.Tenant;
import com.utilities.domains.User;
import com.utilities.services.UserService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller
public class HelloWorldController {

    protected final UserService userService;

    public HelloWorldController(UserService userService) {
        this.userService = userService;
    }

    @Get("/user")
    public List<User> getHelloWorld() {
        return userService.findAll();
    }

    @Get("/tenant")
    public List<Tenant> getTenant() {
        return userService.findAllTenants();
    }
}
