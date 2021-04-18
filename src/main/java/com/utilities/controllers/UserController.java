package com.utilities.controllers;

import com.utilities.domains.Tenant;
import com.utilities.domains.User;
import com.utilities.services.UserService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller("/users")
public class UserController {

    protected final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get
    public List<User> getUsers() {
        return userService.findAll();
    }

    @Get("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.findById(userId);
    }
}
