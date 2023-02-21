package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Controller
public class HomeController {
	
	@Autowired
	PersonDao per_dao;
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person p)
	{
		per_dao.save(p);
		System.out.println("data inserted.. "+p.getPersonName());
		return "index";
	}
	
}
