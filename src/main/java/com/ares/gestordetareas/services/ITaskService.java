package com.ares.gestordetareas.services;

import java.util.List;

import com.ares.gestordetareas.models.domain.Task;

public interface ITaskService {

	public List<Task> listarTareas();
	
	public void guardartarea(Task task);
}
