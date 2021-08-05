package com.org.todo.controller;

import com.org.todo.entity.UserDetailsEntity;
import com.org.todo.exception.ToDoException;
import com.org.todo.repository.UserDetailsRepository;
import com.org.todo.service.user.UserService;
import com.org.todo.util.ToDoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserDetailsController {

    @Autowired
    UserService userService;

    @PostMapping("/user/getUserDetails/{usr}/{pwd}")
    public ToDoResponse getUserDetails(@PathVariable String usr, @PathVariable String pwd) throws ToDoException {
        return userService.signIn(usr, pwd);

    }
}
