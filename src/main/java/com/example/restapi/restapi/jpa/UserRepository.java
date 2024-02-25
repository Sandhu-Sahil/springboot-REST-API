package com.example.restapi.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.restapi.User.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}