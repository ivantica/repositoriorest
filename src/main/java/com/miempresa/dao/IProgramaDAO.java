package com.miempresa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miempresa.models.Programa;

public interface IProgramaDAO extends JpaRepository<Programa, Integer> {

}
