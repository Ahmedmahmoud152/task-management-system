package com.example.Task.Management.API.mapper;

import com.example.Task.Management.API.dto.TaskRequest;
import com.example.Task.Management.API.dto.TaskResponse;
import com.example.Task.Management.API.model.Task;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    Task toEntity(TaskRequest request);

    TaskResponse toResponse(Task task);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromRequest(TaskRequest request, @MappingTarget Task task);
}