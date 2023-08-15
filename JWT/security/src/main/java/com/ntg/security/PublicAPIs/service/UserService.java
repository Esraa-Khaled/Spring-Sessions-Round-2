package com.ntg.security.PublicAPIs.service;

import com.ntg.security.PublicAPIs.entity.Users;
import com.ntg.security.PublicAPIs.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    PasswordEncoder passwordEncoderBean;

    public Iterable<Users> getAllUsers() {
        return userRepo.findAll();
    }

    public Iterable<Users> addAllUsers(List<Users> usersList) {
        usersList.forEach( user ->
                user.setPassword(passwordEncoderBean.encode(user.getPassword())));
        return userRepo.saveAll(usersList);
    }

    public Users findUserByUsername(String username) {
        return userRepo.findUsersByUsername(username);
    }
}
