package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class LoginController {


    @Value("${username}")
    String userName;

    @GetMapping("/login")
    public String login() {
        return "Welcome in NTG " + userName;
    }



}
