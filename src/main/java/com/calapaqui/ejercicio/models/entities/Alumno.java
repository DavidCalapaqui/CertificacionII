package com.calapaqui.ejercicio.models.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="alumnos")
public class Alumno extends Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "identificador")
	private Integer identificador;
	
	@OneToMany(mappedBy="estudiante", fetch=FetchType.LAZY)
	private List<Matricula> matriculas;
	

	public Alumno(Integer id) {
		super();
		this.identificador = id;
	}
	public Alumno() {
		super();

	}
	
	
	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
}

