package com.example.demo.exception;

public class UprocessEntityException extends RuntimeException{

    private String uri;

    private String detail;



    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
