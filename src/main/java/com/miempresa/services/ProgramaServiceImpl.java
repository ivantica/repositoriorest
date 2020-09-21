package com.miempresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miempresa.dao.IProgramaDAO;
import com.miempresa.models.Programa;

@Service
public class ProgramaServiceImpl implements IProgramaServices {

   @Autowired
   private IProgramaDAO dao;
	
	@Override
	public Programa crear(Programa t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Programa actualizar(Programa t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Programa> listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Programa> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
