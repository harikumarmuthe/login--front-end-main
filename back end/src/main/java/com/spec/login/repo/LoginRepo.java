package com.spec.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spec.login.entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity,String>{

	LoginEntity findByUsername(String name);

}
