package dev.rennangalvao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rennangalvao.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}


