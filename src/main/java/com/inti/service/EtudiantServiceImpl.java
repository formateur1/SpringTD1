package com.inti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.inti.model.Etudiant;
import com.inti.repository.IEtudiantRepository;

@Service
public class EtudiantServiceImpl implements IEtudiantService {
	
	@Autowired
	IEtudiantRepository ier;

	@Override
	public Etudiant getEtudiant(int id) {

		return ier.findById(id).get();
	}

	@Override
	public void saveEtudiant(Etudiant etu) {
		
		ier.save(etu);
		
	}

}
