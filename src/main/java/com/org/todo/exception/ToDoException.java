package com.org.todo.exception;

import com.org.todo.util.ToDoResponse;


public class ToDoException extends Exception {

    private static final long serialVersionUID = 853596593825423755L;
    private ToDoResponse errResponse;

    public ToDoResponse getErrResponse() {
        return errResponse;
    }

    public void setErrResponse(ToDoResponse errResponse) {
        this.errResponse = errResponse;
    }
}
