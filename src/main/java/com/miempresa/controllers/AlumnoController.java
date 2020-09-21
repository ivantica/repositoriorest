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

import com.miempresa.models.Alumno;
import com.miempresa.services.IAlumnoServices;

@RestController
@RequestMapping(value = "/alumno")
public class AlumnoController {
	
	@Autowired
	private IAlumnoServices alumno;
	
	@GetMapping
	public List<Alumno> listar() {	
		return alumno.listarTodos();
	}
	
	@GetMapping(value = "/{id}")
	public Alumno listarPorId(@PathVariable("id")Integer id) {	
		return alumno.listarPorId(id).get();
	}
	
	@PostMapping
	public Alumno crear(@RequestBody Alumno alumn) {	
		return alumno.crear(alumn);
		
	}
	@PutMapping
	public Alumno actualizar(@RequestBody Alumno alumn) {	
		return alumno.actualizar(alumn);
		
	}
	@DeleteMapping(value = "/{id}")
	public String eliminar(@PathVariable("id") Integer id) {	
		alumno.eliminar(id);
		return "Mensaje Eliminado";
		
	}
     
	
}
