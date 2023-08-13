package com.ntg.security.PublicAPIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/welcome/{username}")
    public String  welcomeAPI(@PathVariable String username) {
        return "Welcome " + username;
    }

}

