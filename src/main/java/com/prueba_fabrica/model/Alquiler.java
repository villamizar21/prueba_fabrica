package com.prueba_fabrica.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.CascadeType;

@Entity
public class Alquiler {

	@Id
	@Column(name = "alquiler_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer alquiler_id;
	private Date fecha_inicio;
	private Date fecha_entrega;
	

    @OneToMany(mappedBy = "cliente_id", cascade = CascadeType.ALL)
	
	private List<Cliente> cliente;
	

    @OneToMany(mappedBy = "juegos_id", cascade = CascadeType.ALL)
	
	private List<Juegos> juegos;

	private int total;

	public Alquiler(Date fecha_inicio, Date fecha_entrega, List<Cliente> cliente, List<Juegos> juegos, int total) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_entrega = fecha_entrega;
		this.cliente = cliente;
		this.juegos = juegos;
		this.total = total;
	}

	public Alquiler() {
		super();
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Juegos> getJuegos() {
		return juegos;
	}

	public void setJuegos(List<Juegos> juegos) {
		this.juegos = juegos;
	}
	
	

}
