package com.prueba_fabrica.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba_fabrica.model.Alquiler;

public interface Alquiler_interface extends JpaRepository<Alquiler, Integer> {

}
