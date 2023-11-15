package com.example.demo.bean;

import jakarta.persistence.*;
//import jakarta.persistence.ManyToOne;

@Entity
public class Ofertas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String descripcion;
	
	@OneToMany
	
	@JoinColumn(name = "ID")
	Empresa empresa;

	public Ofertas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Getters y Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

}
