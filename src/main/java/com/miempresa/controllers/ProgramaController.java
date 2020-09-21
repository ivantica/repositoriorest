package com.miempresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miempresa.models.Programa;
import com.miempresa.services.IProgramaServices;

@RestController
@RequestMapping(value = "/programa")
public class ProgramaController {
	
	@Autowired
	private IProgramaServices programa;
	
	@GetMapping
	public List<Programa> listar() {	
		return programa.listarTodos();
	}
	
	@GetMapping(value = "/{id}")
	public Programa listarPorId(@PathVariable("id")Integer id) {	
		return programa.listarPorId(id).get();
	}
	
	@PostMapping
	public Programa crear(@RequestBody Programa program) {	
		return programa.crear(program);
		
	}
	@PutMapping
	public Programa actualizar(@RequestBody Programa program) {	
		return programa.actualizar(program);
		
	}
	@DeleteMapping(value = "/{id}")
	public String eliminar(@PathVariable("id") Integer id) {	
		programa.eliminar(id);
		return "Mensaje Eliminado";
		
	}
     
	

}
