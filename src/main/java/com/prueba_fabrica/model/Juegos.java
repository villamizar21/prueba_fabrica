package com.prueba_fabrica.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "juegos")
public class Juegos {
	
	 @Id
	 @Column(name = "juegos_id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer juegos_id;
	 private String titulo;
	 private String protagonista;	
	 private String director;	 
	 private String productor;	 
	 private String tecnologia;	 
	 private Date year;
	 	 
	public Juegos(String titulo, String protagonista, String director, String productor, String tecnologia, Date year) {
		super();
		this.titulo = titulo;
		this.protagonista = protagonista;
		this.director = director;
		this.productor = productor;
		this.tecnologia = tecnologia;
		this.year = year;
	}

	 public Juegos() {
		super();
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
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}
	
	 
	 
}
