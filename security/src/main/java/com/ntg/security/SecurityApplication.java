package com.ntg.security;

import com.ntg.security.PublicAPIs.entity.Role;
import com.ntg.security.PublicAPIs.entity.Users;
import com.ntg.security.PublicAPIs.service.RoleService;
import com.ntg.security.PublicAPIs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}


	@Autowired
	RoleService roleService;

	@Autowired
	UserService userService;


	@PostConstruct
	public void intiateSystemUsers() {

		Role adminRole = new Role("ROLE_ADMIN");
		Role userRole = new Role("ROLE_USER");
		Role viewerRole = new Role("ROLE_VIWER");

		List<Role> roleList = List.of(adminRole, userRole, viewerRole);
		roleService.addAllRoles(roleList);



		Users user1 = new Users("user1", "pwd1", "user1@mail.com");
		user1.addRole(adminRole);
		user1.addRole(userRole);
		user1.addRole(viewerRole);

		Users user2 = new Users("user2", "pwd2", "user2@mail.com");
		user2.addRole(userRole);
		user2.addRole(viewerRole);

		Users user3 = new Users("user3", "pwd3", "user3@mail.com");
		user3.addRole(viewerRole);

		List<Users> usersListList = List.of(user1, user2, user3);
		userService.addAllUsers(usersListList);

	}

}
