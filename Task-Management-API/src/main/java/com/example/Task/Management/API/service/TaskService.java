package com.example.Task.Management.API.service;

import com.example.Task.Management.API.dto.TaskRequest;
import com.example.Task.Management.API.dto.TaskResponse;

import java.util.List;

public interface TaskService {

    TaskResponse createTask(TaskRequest request);

    TaskResponse getTask(Long id);

    List<TaskResponse> getAllTasks();

    TaskResponse updateTask(Long id, TaskRequest request);

    void deleteTask(Long id);
}