package com.org.todo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserDetailsEntity {

    @Id
    @GeneratedValue
    @Column(name = "userId")
    private Long id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "password")
    private String password;
}
