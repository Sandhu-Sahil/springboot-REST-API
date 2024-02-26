package com.example.restapi.restapi.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.restapi.User.Post;


public interface PostRepository extends JpaRepository<Post, Integer> {

}
