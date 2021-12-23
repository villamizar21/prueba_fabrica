package com.prueba_fabrica.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba_fabrica.model.Cliente;

public interface Cliente_interface extends JpaRepository<Cliente, Integer> {

}
