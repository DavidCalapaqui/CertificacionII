package com.calapaqui.ejercicio.models.services;

import java.util.List;

import com.calapaqui.ejercicio.models.entities.Area;

public interface IAreaService {
	public void save(Area a);
	public Area findById(Integer id);
	public void delete(Integer id);
	public List<Area> FindAll();

}
