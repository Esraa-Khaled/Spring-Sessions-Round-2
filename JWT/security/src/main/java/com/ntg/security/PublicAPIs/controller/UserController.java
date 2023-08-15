package com.ntg.security.PublicAPIs.controller;

import com.ntg.security.PublicAPIs.entity.Users;
import com.ntg.security.PublicAPIs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
@RequestMapping("/users")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public Iterable<Users> getAllUsers() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return userService.getAllUsers();
    }

    @PostMapping("/addAll")
    public Iterable<Users> addAllUsers(@RequestBody List<Users> usersList) {
        return userService.addAllUsers(usersList);
    }

//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping("/test")
    public ResponseEntity<?> test() {
        System.out.println("Test ");
        return new ResponseEntity("Test Body",HttpStatus.OK);
    }
}
