package com.devWall76.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devWall76.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long> {

}
