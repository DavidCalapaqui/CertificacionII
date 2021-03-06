package com.calapaqui.ejercicio.models.services;

import java.util.List;

import com.calapaqui.ejercicio.models.entities.Matricula;

public interface IMatriculaService {
	public void save(Matricula m);
	public Matricula findById(Integer id);
	public void delete(Integer id);
	public List<Matricula> FindAll();
}
