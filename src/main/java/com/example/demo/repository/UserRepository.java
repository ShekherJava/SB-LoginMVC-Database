package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserLogin;

public interface UserRepository extends CrudRepository<UserLogin, String> {

}
