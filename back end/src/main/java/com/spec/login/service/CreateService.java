package com.spec.login.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.login.entity.CreateEntity;
import com.spec.login.repo.CreateRepo;

@Service
public class CreateService {
	@Autowired
	CreateRepo crepo;
	
	public CreateEntity createUser(CreateEntity cuser){
		return crepo.save(cuser);
	}

}
