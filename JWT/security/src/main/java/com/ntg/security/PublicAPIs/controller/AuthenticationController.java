package com.ntg.security.PublicAPIs.controller;

import com.ntg.security.PublicAPIs.JWTConfigurations.AuthnticationRequest;
import com.ntg.security.PublicAPIs.JWTConfigurations.AuthnticationResponse;
import com.ntg.security.PublicAPIs.JWTConfigurations.JWTUtils;
import com.ntg.security.PublicAPIs.security.CustomUserDetails;
import com.ntg.security.PublicAPIs.security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class AuthenticationController {


    @Autowired
    AuthenticationManager authenticationManagerBean;


    @Autowired
    JWTUtils jwtUtils;
    @PostMapping("/signin")
    public AuthnticationResponse authnticate(@RequestBody AuthnticationRequest authnticationRequest,
                                             @RequestHeader(name="Host") String host, @RequestHeader(name = "User-Agent") String agent) {
        authenticationManagerBean.authenticate(
                new UsernamePasswordAuthenticationToken(authnticationRequest.getUsername(), authnticationRequest.getPassword()));
        return jwtUtils.genrateToken(authnticationRequest.getUsername(), host, agent);
    }
}
