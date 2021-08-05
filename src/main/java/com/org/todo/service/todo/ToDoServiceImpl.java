package com.org.todo.service.todo;

import com.org.todo.entity.ToDoEntity;
import com.org.todo.repository.ToDoRepository;
import com.org.todo.util.ToDoResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {
    private static final Logger logger = LogManager.getLogger(ToDoServiceImpl.class);

    @Autowired
    ToDoRepository toDoRepository;

    private ToDoResponse response;

    public ToDoResponse createToDo(ToDoEntity toDoListEntity) {

        try {
            response=new ToDoResponse();
            toDoRepository.save(toDoListEntity);
            response.setStatusCode(HttpStatus.OK.value());
            response.setStatus(HttpStatus.OK);
            response.setResponse("success");

        } catch (Exception e) {
            logger.info("ToDoServiceImpl.createToDo ==>" + e.getMessage());
            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            response.setResponse("failure");
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public ToDoResponse updateToDo(ToDoEntity toDoListEntity) {
        try {
            response=new ToDoResponse();
            toDoRepository.save(toDoListEntity);
            response.setStatusCode(HttpStatus.OK.value());
            response.setStatus(HttpStatus.OK);
            response.setResponse("success");
        } catch (Exception e) {
            logger.info("ToDoServiceImpl.updateToDo " + e.getMessage());
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public List<ToDoEntity> getToDo(String user) {
        List<ToDoEntity> list = new ArrayList<>();
        try {
            list = toDoRepository.findAllByModifiedby(user);
            //list = toDoRepository.findAll();
        } catch (Exception e) {
            logger.info("ToDoServiceImpl.getToDo " + e.getMessage());
        }
        return list;
    }

    @Override
    public ToDoResponse deleteToDo(Integer id) {
        try {
            response=new ToDoResponse();
            toDoRepository.deleteById(id);
            response.setStatusCode(HttpStatus.OK.value());
            response.setStatus(HttpStatus.OK);
            response.setResponse("success");
        }catch (Exception e){
            logger.info("ToDoServiceImpl.deleteToDo " + e.getMessage());
            e.printStackTrace();
        }
        return response;
    }


}
