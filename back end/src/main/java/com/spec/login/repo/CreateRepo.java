package com.spec.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spec.login.entity.CreateEntity;

public interface CreateRepo extends JpaRepository<CreateEntity,String>{

}
