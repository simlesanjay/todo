package com.org.todo.service.todo;

import com.org.todo.entity.ToDoEntity;
import com.org.todo.util.ToDoResponse;

import java.util.List;

public interface ToDoService {

    ToDoResponse createToDo(ToDoEntity toDoListEntity);
    ToDoResponse updateToDo(ToDoEntity toDoListEntity);
    List<ToDoEntity> getToDo(String user);
    ToDoResponse deleteToDo(Integer id);
}
