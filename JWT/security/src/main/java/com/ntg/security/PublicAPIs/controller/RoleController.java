package com.ntg.security.PublicAPIs.controller;

import com.ntg.security.PublicAPIs.entity.Role;
import com.ntg.security.PublicAPIs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    
    
    @Autowired
    RoleService roleService;
    
    @GetMapping("/getAll")
    public Iterable<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping("/addAll")
    public Iterable<Role> addAllRoles(@RequestBody List<Role> RolesList) {
        return roleService.addAllRoles(RolesList);
    }
}
