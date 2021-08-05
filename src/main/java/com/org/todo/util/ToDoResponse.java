package com.org.todo.util;

import org.springframework.http.HttpStatus;

public class ToDoResponse {

    private HttpStatus status;
    private int statusCode;
    private String response;
    private String errorMsg;
    private ToDoErrorCode errorCode;
    private String referenceId;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ToDoErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ToDoErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
