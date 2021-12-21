package com.prueba_fabrica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	 @Id
	 @Column(name = "cliente_id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer cliente_id;
	 private String nombre;
	 private int telefono;
	 private String correo;
	
	
	public Cliente( String nombre, int telefono, String correo) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}
	 

	public Cliente() {
		super();
	}


	public int getCleinte_id() {
		return cliente_id;
	}

	public void setCleinte_id(Integer cleinte_id) {
		this.cliente_id = cleinte_id;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
