package com.ntg.security.PublicAPIs.repository;

import com.ntg.security.PublicAPIs.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

    public Users findUsersByUsername(String username);
}
