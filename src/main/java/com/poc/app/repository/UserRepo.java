package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.app.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
