package com.org.todo.util;


public enum ToDoErrorCode {
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
    TASK_PROCESSING_ERROR("TASK_PROCESSING_ERROR"),
    USER_LOGIN_ERROR("USER_LOGIN_ERROR");

    private final String name;

    private ToDoErrorCode(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equalsIgnoreCase(otherName);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
