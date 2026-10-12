package com.example.Task.Management.API.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TaskResponse {

    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private boolean completed;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // getters and setters
}