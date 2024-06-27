package com.spec.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spec.login.entity.CreateEntity;
import com.spec.login.entity.LoginEntity;
import com.spec.login.service.CreateService;
import com.spec.login.service.LoginService;

@CrossOrigin("*")
@RestController
public class LoginController {

	@Autowired
	LoginService lser;
	@Autowired
	CreateService cser;
	
	@PostMapping("/add/user")
	public LoginEntity addLogin(@RequestBody LoginEntity luser) {
		return lser.addUser(luser);
	}
	
	@GetMapping("/get/user")
	public List<LoginEntity> getUser(){
		return lser.getUser();
	}
	@GetMapping("/user/login")
	public String checkLogin(@RequestParam String username,@RequestParam String password) {
		return lser.checkIsValidUser(username,password);
	
	}
	
	@PostMapping("/create/user")
	public CreateEntity addUser(@RequestBody CreateEntity cuser){
		return cser.createUser(cuser);
	}
}
