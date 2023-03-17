package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Game {

	@Id
	private int gameId;
	private String gameName;
	private String gameCategory;
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameCategory() {
		return gameCategory;
	}
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}
	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", gameName=" + gameName + ", gameCategory=" + gameCategory + "]";
	}
	
	
}
