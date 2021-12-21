package com.prueba_fabrica.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "alquiler")
public class Alquiler {
	
	@ManyToOne()
  	@JoinColumn(name="cliente_id")
  	@JsonBackReference
  	private Cliente cliente;

	
	@OneToMany(mappedBy = "alquiler", cascade = CascadeType.ALL)
	@JsonManagedReference
    private List<Juegos> juegos;
	
	
	
	public Alquiler( List<Juegos> juegos, Integer alquiler_id, int juegos_id, int alquile_time,
			int alquiler_precio) {
		super();
		this.juegos = juegos;
		this.alquiler_id = alquiler_id;
		this.juegos_id = juegos_id;
		this.alquile_time = alquile_time;
		this.alquiler_precio = alquiler_precio;
	}

	@Id
	private Integer alquiler_id; 
	
	@Column (name = "juegos_id")
	private int juegos_id;
	
	@Column (name = "alquile_time")
	private int alquile_time;
	
	@Column (name = "alquiler_precio")
	private int alquiler_precio;

	public Integer getAlquiler_id() {
		return alquiler_id;
	}

	public void setAlquiler_id(Integer alquiler_id) {
		this.alquiler_id = alquiler_id;
	}

	public int getJuegos_id() {
		return juegos_id;
	}

	public void setJuegos_id(int juegos_id) {
		this.juegos_id = juegos_id;
	}

	public int getAlquile_time() {
		return alquile_time;
	}

	public void setAlquile_time(int alquile_time) {
		this.alquile_time = alquile_time;
	}

	public int getAlquiler_precio() {
		return alquiler_precio;
	}

	public void setAlquiler_precio(int alquiler_precio) {
		this.alquiler_precio = alquiler_precio;
	}

}
