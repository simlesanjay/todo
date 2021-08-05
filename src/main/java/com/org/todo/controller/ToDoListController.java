package com.org.todo.controller;

import com.org.todo.entity.ToDoEntity;
import com.org.todo.exception.ToDoException;
import com.org.todo.service.todo.ToDoService;
import com.org.todo.service.user.UserService;
import com.org.todo.util.ToDoResponse;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ToDoListController {

    @Autowired
    ToDoService toDoService;

    @PostMapping("/todo/saveTodo")
    public ToDoResponse create(@RequestBody ToDoEntity toDoListEntity) {
        return toDoService.createToDo(toDoListEntity);
    }

    @PostMapping("/todo/updateTodo")
    public ToDoResponse update(@RequestBody ToDoEntity toDoListEntity) {
       return toDoService.updateToDo(toDoListEntity);
    }

    @GetMapping("/todo/getTodo/{user}")
    public List<ToDoEntity> getToDoList(String user) {
        return toDoService.getToDo(user);
    }

    @DeleteMapping("/todo/deleteTodo/{id}")
    public ToDoResponse deleteFromList(@PathVariable Integer id){
      return  toDoService.deleteToDo(id);

    }


}
