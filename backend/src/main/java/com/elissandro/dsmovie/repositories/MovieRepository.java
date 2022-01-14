package com.elissandro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elissandro.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
