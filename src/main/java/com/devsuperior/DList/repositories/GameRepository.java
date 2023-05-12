package com.devsuperior.DList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
