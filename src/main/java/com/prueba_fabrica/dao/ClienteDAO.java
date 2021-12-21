package com.prueba_fabrica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba_fabrica.model.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
