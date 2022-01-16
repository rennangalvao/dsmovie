package dev.rennangalvao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rennangalvao.dsmovie.entities.Score;
import dev.rennangalvao.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
	

}


