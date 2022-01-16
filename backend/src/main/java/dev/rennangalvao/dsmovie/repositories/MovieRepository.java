package dev.rennangalvao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rennangalvao.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	

}


