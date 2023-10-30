package com.example.bolsatrabajo.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {
    //ID INT NOT NULL AUTO_INCREMENT,
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    //NOMBRE VARCHAR(50) NOT NULL,
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    //DIRECCION VARCHAR(50) NOT NULL,
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;
    //TELEFONO VARCHAR(50) NOT NULL,
    @Column(name = "telefono", length = 50, nullable = false)
    private String telefono;

    public Empresa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
