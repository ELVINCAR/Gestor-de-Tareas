package com.ares.gestordetareas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ares.gestordetareas.models.domain.Task;

@Service
public class TaskServiceImpl implements ITaskService{

	@Autowired
	TaskRepository task;
	
	@Override
	public List<Task> listarTareas() {
		return task.findAll();
	}

	@Override
	public void guardartarea(Task tarea) {
		task.save(tarea);
	}

}
