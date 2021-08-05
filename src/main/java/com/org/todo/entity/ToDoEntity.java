package com.org.todo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "ToDo")
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "done")
    private Boolean done;
    @Column(name = "modified_by")
    private String modifiedby;
    @Column(name = "modified_on")
    private String modifiedon;

}
