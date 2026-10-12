package com.example.Task.Management.API.repository;

import com.example.Task.Management.API.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
