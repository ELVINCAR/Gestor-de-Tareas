package com.ares.gestordetareas.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ares.gestordetareas.models.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	
}
