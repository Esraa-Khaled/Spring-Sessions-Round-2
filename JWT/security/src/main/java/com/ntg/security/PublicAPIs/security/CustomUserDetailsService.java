package com.ntg.security.PublicAPIs.security;

import com.ntg.security.PublicAPIs.entity.Users;
import com.ntg.security.PublicAPIs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users targetUser = userService.findUserByUsername(username);
        CustomUserDetails customUserDetails = new CustomUserDetails(targetUser);
        return customUserDetails;
    }
}
