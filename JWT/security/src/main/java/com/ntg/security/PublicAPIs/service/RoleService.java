package com.ntg.security.PublicAPIs.service;

import com.ntg.security.PublicAPIs.entity.Role;
import com.ntg.security.PublicAPIs.entity.Users;
import com.ntg.security.PublicAPIs.repository.RoleRepo;
import com.ntg.security.PublicAPIs.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepo roleRepo;

    public Iterable<Role> getAllRoles() {
        return roleRepo.findAll();
    }

    public Iterable<Role> addAllRoles(List<Role> rolesList) {
        return roleRepo.saveAll(rolesList);
    }
}
