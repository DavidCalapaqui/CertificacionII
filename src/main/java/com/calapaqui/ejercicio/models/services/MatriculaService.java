package com.calapaqui.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.calapaqui.ejercicio.models.dao.IMatricula;
import com.calapaqui.ejercicio.models.entities.Matricula;

@Service
public class MatriculaService implements IMatriculaService {
	
	@Autowired
	private IMatricula dao;
	
	@Override
	@Transactional
	public void save(Matricula m) {
		dao.save(m);
	}

	@Override
	@Transactional
	public Matricula findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Matricula> FindAll() {
		return (List<Matricula>) dao.findAll();
	}

}
