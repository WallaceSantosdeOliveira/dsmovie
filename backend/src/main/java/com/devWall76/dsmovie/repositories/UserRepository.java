package com.devWall76.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devWall76.dsmovie.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
	
	User findByEmail(String email);
}
