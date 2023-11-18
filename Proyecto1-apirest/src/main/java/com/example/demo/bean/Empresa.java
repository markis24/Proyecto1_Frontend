package com.example.demo.bean;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nom;

    @Column(nullable = false)
    private String cif;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Ofertas> ofertas;

    // Constructores, getters y setters

    public Empresa() {
        super();
    }

    public Empresa(String nom, String cif) {
        this.nom = nom;
        this.cif = cif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<Ofertas> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Ofertas> ofertas) {
        this.ofertas = ofertas;
    }
}
