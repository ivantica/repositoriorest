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


import com.miempresa.models.Matricula;

import com.miempresa.services.IMatriculaServices;

@RestController
@RequestMapping(value = "/matricula")
public class MatriculaController {

	@Autowired
	private IMatriculaServices matricula;
	
	@GetMapping
	public List<Matricula> listar() {	
		return matricula.listarTodos();
	}
	
	@GetMapping(value = "/{id}")
	public Matricula listarPorId(@PathVariable("id")Integer id) {	
		return matricula.listarPorId(id).get();
	}
	
	@PostMapping
	public Matricula crear(@RequestBody Matricula matric) {	
		return matricula.crear(matric);
		
	}
	@PutMapping
	public Matricula actualizar(@RequestBody Matricula matric) {	
		return matricula.actualizar(matric);
		
	}
	@DeleteMapping(value = "/{id}")
	public String eliminar(@PathVariable("id") Integer id) {	
		matricula.eliminar(id);
		return "Mensaje Eliminado";
		
	}
     
	
	
}
