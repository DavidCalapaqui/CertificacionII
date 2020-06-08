package com.calapaqui.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.calapaqui.ejercicio.models.entities.Alumno;
 //CrudRepository<modelo, tipo de dato de pk>
public interface IAlumno  extends CrudRepository<Alumno, Integer>{

}
