package com.devWall76.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devWall76.dsmovie.entities.Score;
import com.devWall76.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score, ScorePK> {

}
