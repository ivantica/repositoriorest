package com.miempresa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miempresa.models.Alumno;

public interface IAlumnoDAO extends JpaRepository<Alumno, Integer> {

}
