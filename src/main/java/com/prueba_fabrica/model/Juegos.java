package com.prueba_fabrica.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "juegos")
public class Juegos {
	
	public Juegos(Alquiler alquiler, Integer juegos_id, String titulo, String protagonista, String director,
			String productor, String tecnologia) {
		super();
		this.alquiler = alquiler;
		this.juegos_id = juegos_id;
		this.titulo = titulo;
		this.protagonista = protagonista;
		this.director = director;
		this.productor = productor;
		this.tecnologia = tecnologia;
	}
	public Juegos( Integer juegos_id, String titulo, String protagonista, String director,
			String productor, String tecnologia) {
		super();
		this.juegos_id = juegos_id;
		this.titulo = titulo;
		this.protagonista = protagonista;
		this.director = director;
		this.productor = productor;
		this.tecnologia = tecnologia;
	}

	@ManyToOne()
	@JoinColumn(name="alquiler_id")
	@JsonBackReference
	private Alquiler alquiler;
	

	@Id
	private Integer juegos_id;
	
	@Column(name = "titulo" )
	private String titulo;
	
	@Column(name = "year" )
	private Date year;
	
	@Column(name = "protagonista" )
	private String protagonista;
	
	@Column(name = "director" )
	private String director;
	
	@Column(name = "productor" )
	private String productor;
	
	@Column(name = "tecnologia" )
	private String tecnologia;

	public Integer getJuegos_id() {
		return juegos_id;
	}

	public void setJuegos_id(Integer juegos_id) {
		this.juegos_id = juegos_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getProtagonista() {
		return protagonista;
	}

	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	
	

}
