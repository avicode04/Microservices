package com.stackroute.controller;


import com.stackroute.domain.User;
import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {


  UserService userService;

  @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/echoUserName/{name}")
    public String echoUserName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }

    @RequestMapping(value = "/getUserDetails/{name}")
    public User getUserDetails(@PathVariable(name = "name") String name)
    {
        return new User(name, "last-name", 20, "new user", 1);
    }

    public static void main(String[] args)
    {
        SpringApplication.run(UserController.class, args);
    }


}
