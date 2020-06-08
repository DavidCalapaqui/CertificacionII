package com.calapaqui.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.calapaqui.ejercicio.models.entities.Profesor;

public interface IProfesor  extends CrudRepository<Profesor, Integer> {

}
