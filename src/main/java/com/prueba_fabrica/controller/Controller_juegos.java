package com.prueba_fabrica.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba_fabrica.interfaces.Juegos_interface;
import com.prueba_fabrica.model.Juegos;

@RestController
@RequestMapping(path = "/juegosAlquilados", method = RequestMethod.POST)
public class Controller_juegos {

	@Autowired
	private Juegos_interface juegosDao;
	
	@GetMapping(path = "/Listarjuegos")
	public @ResponseBody List<Juegos> buscarJuegos() { 
		return juegosDao.findAll();
	}

	@PostMapping(path = "/agregarJuego")
	public Map<String, Object> agregarJuego(@RequestBody Juegos juego, Model model) {
		try {
			Juegos j = new Juegos(juego.getTitulo(), juego.getProtagonista(), juego.getDirector(),
					juego.getProductor(), juego.getTecnologia(), juego.getYear());
			juegosDao.save(j);
			return respuesta(true, "Registro exitoso", "OK");
		} catch (Exception e) {
			return respuesta(true, "No se pudo registar el juego " + e.getMessage(), null);
		}
	}

	public static Map<String, Object> respuesta(boolean status, String msg, Object data) {
		Map<String, Object> respuesta = new HashMap<>();
		respuesta.put("msg", msg);
		respuesta.put("data", data);
		respuesta.put("status", status);
		return respuesta;
	}

}
