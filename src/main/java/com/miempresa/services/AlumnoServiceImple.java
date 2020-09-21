package com.miempresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miempresa.dao.IAlumnoDAO;
import com.miempresa.models.Alumno;

@Service
public class AlumnoServiceImple implements IAlumnoServices {

	@Autowired
	private IAlumnoDAO dao;
	
	
	@Override
	public Alumno crear(Alumno alumno) {	
		return dao.save(alumno);
	}

	@Override
	public Alumno actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		return dao.save(alumno);
	}

	@Override
	public Optional<Alumno> listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Alumno> listarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

}
