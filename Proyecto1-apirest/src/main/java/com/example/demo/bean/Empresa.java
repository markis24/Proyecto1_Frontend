package com.example.demo.bean;

import jakarta.persistence.*;

@Entity
public class Empresa {
	@Id //jakarta.persistence.Id
	private long id;

	@Column(nullable = false, unique = true)
	private String nom;

	@Column(nullable = false)
	private String cif;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(long id, String nom, String cif) {
		super();
		this.id = id;
		this.nom = nom;
		this.cif = cif;
	}

	private long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}

	private String getNom() {
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}

	private String getCif() {
		return cif;
	}

	private void setCif(String cif) {
		this.cif = cif;
	}
}
	// A PARTIR D'AQUÍ CODI GENERAT DES DEL MENÚ "Source"
      // Els 2 constructors i els getters i setters

