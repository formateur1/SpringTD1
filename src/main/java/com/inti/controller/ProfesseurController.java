package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.model.Professeur;
import com.inti.repository.IProfesseurRepository;

@RestController
@RequestMapping({"prof", "professeur"})
public class ProfesseurController {
	
	@Autowired
	IProfesseurRepository ipr;
	
	
	@GetMapping("/ById/{id}")
	public Professeur profById(@PathVariable int id)
	{
		return ipr.findById(id).get();
	}

}
