package com.spec.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.login.entity.LoginEntity;
import com.spec.login.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired	
	LoginRepo lrepo;
	
	public LoginEntity addUser(LoginEntity lguser) {
		return lrepo.save(lguser);
	}
	
	public List<LoginEntity> getUser() {
		return lrepo.findAll();
	}

	public String checkIsValidUser(String name, String password) {
		
		LoginEntity lgUser = lrepo.findByUsername(name);
		
		if( (lgUser != null) && (lgUser.getPassword().contentEquals(password) == true)){
			
			return "success";
		}
		
		return "failure";
}
}
