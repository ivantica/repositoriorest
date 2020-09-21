package com.miempresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miempresa.dao.IMatriculaDAO;
import com.miempresa.models.Matricula;

@Service
public class MatriculaServiceImple implements IMatriculaServices {

	@Autowired
	private IMatriculaDAO dao;
	
	@Override
	public Matricula crear(Matricula t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Matricula actualizar(Matricula t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Matricula> listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> listarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
