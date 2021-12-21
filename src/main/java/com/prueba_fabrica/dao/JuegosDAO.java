package com.prueba_fabrica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba_fabrica.model.Juegos;

public interface JuegosDAO extends JpaRepository<Juegos, Integer> {

}
