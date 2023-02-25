package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GameRepo;
import com.example.demo.model.Game;

@RestController
public class HomeController {

	@Autowired
	GameRepo gRepo;
	
	@GetMapping("/games")
	public List<Game> getAll()
	{
		return gRepo.findAll();
	}
	
	@GetMapping("/game/{myId}")
	public Optional<Game> getGame(@PathVariable("myId") int id)
	{
		return gRepo.findById(id);
	}
	
	@PostMapping("/game")
	public String addGame(Game g)
	{
		gRepo.save(g);
		return g+"is added..";
	}
	
	@DeleteMapping("/game/{id}")
	public String deleteGame(@PathVariable("id") int id)
	{
		Game g = gRepo.getById(id);
		gRepo.delete(g);
		return g.getGameName()+" has been deleted...";
	}
	
	
	 
}
