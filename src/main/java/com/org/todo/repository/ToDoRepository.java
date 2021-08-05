package com.org.todo.repository;

import com.org.todo.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDoEntity,Integer> {

    public List<ToDoEntity> findAllByModifiedby(String user);
}
