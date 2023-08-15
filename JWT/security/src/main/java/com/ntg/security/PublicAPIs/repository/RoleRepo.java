package com.ntg.security.PublicAPIs.repository;

import com.ntg.security.PublicAPIs.entity.Role;
import com.ntg.security.PublicAPIs.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
