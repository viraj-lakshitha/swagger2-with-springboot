package com.example.swagger2withspringboot.models;

public class ResponseVO<T> {
    private T data;
    private String message;
    private Boolean status;

    public ResponseVO(T data, String message, Boolean status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public ResponseVO() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
