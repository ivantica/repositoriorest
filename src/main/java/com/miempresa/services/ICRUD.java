package com.miempresa.services;

import java.util.List;
import java.util.Optional;



public interface ICRUD<T> {
	
	public T crear(T t);
	public T actualizar(T t);
	public Optional<T> listarPorId(Integer id);
	public List<T> listarTodos();
	public void eliminar(Integer id);

}
