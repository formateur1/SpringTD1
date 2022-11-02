package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ProfesseurSpring")
@Data @NoArgsConstructor @AllArgsConstructor
public class Professeur {
	
	@Id
	private int id;
	private String nom;
	private String prenom;
	private double salaire;

}
