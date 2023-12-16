package com.ares.gestordetareas.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ares.gestordetareas.models.domain.Task;
import com.ares.gestordetareas.services.ITaskService;

@Controller
@RequestMapping("/")
public class TaskController {
	@Autowired
	private ITaskService task;

	@GetMapping("/gestor")
	public String Listar(Model model) {
		Task nuevaTarea = new Task();
		nuevaTarea.setName("Nombre de la tarea");
		nuevaTarea.setDescription("Descripción de la tarea");
		nuevaTarea.setDate(LocalDate.now()); // Puedes establecer la fecha actual u otra fecha según sea necesario
		nuevaTarea.setStatus("Pendiente");
		
		task.guardartarea(nuevaTarea);
		
		model.addAttribute("tasks", task.listarTareas());
		return "index";
	}

	
	@PostMapping("/guardar")
	public String Guardar (@RequestParam String name, String description) {
		return "redirect:/"; // Redirige a la página principal o a donde desees después de guardar
	}
}
