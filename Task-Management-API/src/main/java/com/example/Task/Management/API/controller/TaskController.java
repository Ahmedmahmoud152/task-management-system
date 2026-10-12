package com.example.Task.Management.API.controller;

import com.example.Task.Management.API.dto.TaskRequest;
import com.example.Task.Management.API.dto.TaskResponse;
import com.example.Task.Management.API.model.Task;
import com.example.Task.Management.API.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/{id}")
    public TaskResponse getTaskById(
            @PathVariable Long id) {
      return taskService.getTask(id);
    }
    @GetMapping
    public List<TaskResponse> getAllTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping
    public TaskResponse createTask(@Valid @RequestBody TaskRequest request) {
        return taskService.createTask(request);
    }
    @PutMapping("/{id}")
    public TaskResponse updateTask(
            @PathVariable Long id,
            @RequestBody TaskRequest task) {

        return taskService.updateTask(id, task);
    }
    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
