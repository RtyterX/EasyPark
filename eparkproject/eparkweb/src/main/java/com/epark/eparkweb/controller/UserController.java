package com.epark.eparkweb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epark.eparkweb.entity.User;
import com.epark.eparkweb.service.UserService;

@RestController
@RequestMapping(value ="localhost://users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping(value = "/save-user")
	public ResponseEntity<String> salvaUsuario(@RequestBody User user) {
		User userSave = userService.saveUser(user);
		return ResponseEntity.ok("Usuario salvo com sucesso . ID:" + userSave.getId());
	}
	
	
	//@GetMapping(value = "/all")
	//public ResponseEntity<User> findAll() {
		//User u = new User(1L,"Daniel", "598.536.429-48", 18, "daniel@gmail.com", "11256789", "99999999");
		//return ResponseEntity.ok().body(u);
	//}

}
