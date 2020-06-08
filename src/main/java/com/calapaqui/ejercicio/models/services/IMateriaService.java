package com.calapaqui.ejercicio.models.services;

import java.util.List;

import com.calapaqui.ejercicio.models.entities.Materia;

public interface IMateriaService {
	
	public void save(Materia m);
	public Materia findById(Integer id);
	public void delete(Integer id);
	public List<Materia> FindAlll();

}
