package com.miempresa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miempresa.models.Matricula;

public interface IMatriculaDAO extends JpaRepository<Matricula, Integer>{

}
