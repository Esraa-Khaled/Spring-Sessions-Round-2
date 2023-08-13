package com.ntg.security.PublicAPIs.controller;

import com.ntg.security.PublicAPIs.entity.Users;
import com.ntg.security.PublicAPIs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public Iterable<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addAll")
    public Iterable<Users> addAllUsers(@RequestBody List<Users> usersList) {
        return userService.addAllUsers(usersList);
    }
}
