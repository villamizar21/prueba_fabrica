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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba_fabrica.dao.ClienteDAO;
import com.prueba_fabrica.model.Cliente;

@RestController
@RequestMapping(path = "/clientes", method = RequestMethod.POST)
public class Controller_cliente {

	@Autowired
	private ClienteDAO clienteDao;

	@GetMapping(path = "/listarClientes")
	public @ResponseBody List<Cliente> listar() {
		return clienteDao.findAll();
	}

	@PostMapping(path = "/resgistarCliente")
	public Map<String, Object> registar(@RequestBody Cliente cliente, Model model) {
		
		try {
			Cliente c = new Cliente(cliente.getNombre(),cliente.getTelefono(),cliente.getCorreo());
			clienteDao.save(c);
			return respuesta(true, "se regristo el cliente", null);
		} catch (Exception e) {
			return respuesta(true, "No se pudo registar el cliente " +e.getMessage(), null);
		}
	}
	
	@GetMapping(path ="/{id}")
	public Map<String,Object> buscarCliente(@PathVariable Integer id){
		Optional<Cliente> cliente = clienteDao.findById(id);
		
		try {
			if(cliente.isPresent()) {
				Cliente c = cliente.get();
				return respuesta(true, "Cliente encontrado", c);
			}else {
				return respuesta(true, "Cliente no encontrado", null);
			}
		}catch(Exception e) {
			return respuesta(true, "Cliente no encontrado "+e.getMessage(), null);
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
