package com.prueba_fabrica.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba_fabrica.interfaces.Alquiler_interface;
import com.prueba_fabrica.interfaces.Cliente_interface;
import com.prueba_fabrica.interfaces.Juegos_interface;
import com.prueba_fabrica.model.Alquiler;
import com.prueba_fabrica.model.Cliente;
import com.prueba_fabrica.model.Juegos;

@RestController
@RequestMapping(path = "/alquiler")
public class Controller_Alquiler {

	@Autowired
	private Alquiler_interface Ialquiler;
	@Autowired
	private Cliente_interface Icliente;
	@Autowired
	private Juegos_interface Ijuego;

	
	@GetMapping(path = "/mostrarAlquileres")
	public @ResponseBody List<Alquiler> mostrarAlquileres() {
		return Ialquiler.findAll();
	}

/*	@PostMapping(path = "/nuevoAlquiler/{id}")
	public Map<String, Object> registarAlquiler(@RequestBody Alquiler alquiler, Model model, @PathVariable Integer id) {

		Optional<Cliente> clie = Icliente.findById(id);
		Alquiler al = new Alquiler(alquiler.getFecha_inicio(), alquiler.getFecha_entrega(), alquiler.getCliente(),
				alquiler.getJuegos(), alquiler.getTotal());
	
			return respuesta(true, "", null);

	}*/

	public static Map<String, Object> respuesta(boolean status, String msg, Object data) {
		Map<String, Object> respuesta = new HashMap<>();
		respuesta.put("msg", msg);
		respuesta.put("data", data);
		respuesta.put("status", status);
		return respuesta;
	}
}
