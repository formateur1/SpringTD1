package com.inti.service;

import com.inti.model.Etudiant;

public interface IEtudiantService {
	public Etudiant getEtudiant(int id);
	public void saveEtudiant(Etudiant etu);
}
