package com.org.todo.service.user;

import com.org.todo.exception.ToDoException;
import com.org.todo.util.ToDoResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public ToDoResponse signIn(String usr, String pwd) throws ToDoException;
}
