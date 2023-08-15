package com.ntg.security.PublicAPIs.JWTConfigurations;


import lombok.Data;

@Data
public class AuthnticationRequest {

    private String username;
    private String password;
}
