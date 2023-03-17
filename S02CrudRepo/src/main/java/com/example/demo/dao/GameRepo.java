package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Game;

@RepositoryRestResource(collectionResourceRel="games",path="games")
public interface GameRepo  extends JpaRepository<Game, Integer>{

}
