package com.calapaqui.ejercicio.models.services;

import java.util.List;

import com.calapaqui.ejercicio.models.entities.Aula;

public interface IAulaService {

	public void save(Aula a);
	public Aula findById(Integer id);
	public void delete(Integer id);
	public List<Aula> FindAll();
}
