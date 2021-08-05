package com.org.todo.service.user;

import com.org.todo.entity.UserDetails;
import com.org.todo.exception.ToDoException;
import com.org.todo.service.todo.ToDoServiceImpl;
import com.org.todo.util.ToDoErrorCode;
import com.org.todo.util.ToDoResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

    public ToDoResponse signIn(String usr, String pwd) throws ToDoException {
        ToDoResponse response=new ToDoResponse();
        boolean flag = false;
        List<UserDetails> details = new ArrayList<>();
        UserDetails user = new UserDetails();
        user.setUsername("test");
        user.setPassword("pwd123");
        details.add(user);
        user.setUsername("test1");
        user.setPassword("pwd456");
        details.add(user);
        System.out.println("signIn called");
        // flag=    details.stream().anyMatch(e->e.getUsername().equals(usr) && e.getPassword().equals(pwd));

         if(details.stream().anyMatch(e->e.getUsername().equals(usr) && e.getPassword().equals(pwd))){
             response.setStatusCode(HttpStatus.OK.value());
             response.setStatus(HttpStatus.OK);
             response.setErrorMsg("successful");
         }else{
             response.setStatusCode(HttpStatus.NOT_FOUND.value());
             response.setStatus(HttpStatus.NOT_FOUND);
             response.setErrorMsg("unsuccessful");
         }

        return response;
    }
}
