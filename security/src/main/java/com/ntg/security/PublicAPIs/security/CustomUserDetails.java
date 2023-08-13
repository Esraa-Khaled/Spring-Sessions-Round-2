package com.ntg.security.PublicAPIs.security;

import com.ntg.security.PublicAPIs.entity.Role;
import com.ntg.security.PublicAPIs.entity.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomUserDetails implements UserDetails {

    Users targetUser;

    public CustomUserDetails() {}
    public CustomUserDetails(Users targetUser) {
        this.targetUser = targetUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return setAuthorties(targetUser.getRoles());
    }

    private Collection<? extends GrantedAuthority> setAuthorties(Set<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return targetUser.getPassword();
    }

    @Override
    public String getUsername() {
        return targetUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
