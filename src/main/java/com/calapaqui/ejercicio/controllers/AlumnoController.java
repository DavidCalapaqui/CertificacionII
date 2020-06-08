package com.calapaqui.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calapaqui.ejercicio.models.entities.Alumno;
import com.calapaqui.ejercicio.models.services.IAlumnoService;

@Controller
@RequestMapping(value="/alumno")
public class AlumnoController {
	//todas las peticiones que gestiona este controlador empiezan por /alumno
	@Autowired
	private IAlumnoService srvAlumno;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("title", "Registro de nuevo alumno");
		model.addAttribute("alumno", alumno); // como un viewbag
		return "alumno/form"; // la ubicacion de la vista 
	}
	
	@GetMapping(value="/retrieve")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Alumno alumno = srvAlumno.findById(id);
		model.addAttribute("alumno", alumno);
		return "alumno/card"; 
	}
	
	@PostMapping(value="/save")
	public String save(Alumno alumno, Model model) {
		this.srvAlumno.save(alumno);
		return "redirect:/alumno/list";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Alumno alumno = srvAlumno.findById(id);
		model.addAttribute("alumno", alumno);
		model.addAttribute("title","Actualizando el registro de "+ alumno);
		return "alumno/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		this.srvAlumno.delete(id);
		return "redirect:/alumno/list";
	}
	
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Alumno> alumnos = srvAlumno.FindAll();
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("title", "Listado de alumnos");
		return "alumno/list";
	}
	
	
	
	
}
