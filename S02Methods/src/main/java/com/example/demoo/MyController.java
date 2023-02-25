package com.example.demoo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

	@RequestMapping("/home")
	@ResponseBody
	public String getGames() {
		
		return "Hello";
	}
	
}
