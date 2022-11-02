package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.model.Etudiant;
import com.inti.service.EtudiantServiceImpl;

@RestController
@RequestMapping({"etudiant", "etu"})
public class EtudiantController {
	
	@Autowired
	EtudiantServiceImpl esi;
	
	@GetMapping({"/etudiantById", "/etuById"})
	public Etudiant getEtudiantById(@RequestParam(name = "id") int id)
	{
//		EtudiantServiceImpl esi = new EtudiantServiceImpl();
		System.out.println("etudiant : " + esi.getEtudiant(id));
		return esi.getEtudiant(id);
	}
	
	

}
