package com.elissandro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elissandro.dsmovie.entities.Score;
import com.elissandro.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
