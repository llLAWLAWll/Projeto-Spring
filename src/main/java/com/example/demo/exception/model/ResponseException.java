package com.example.demo.exception.model;

import java.time.LocalDateTime;

public class ResponseException {

    private LocalDateTime currentTime;

    private String detail;

    private String message;

    private String uri;


    public ResponseException(LocalDateTime currentTime, String detail, String message, String uri) {
        this.currentTime = currentTime;
        this.detail = detail;
        this.message = message;
        this.uri = uri;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        uri = uri;
    }

    @Override
    public String toString() {
        return "ResponseException{" +
                "currentTime=" + currentTime +
                ", detail='" + detail + '\'' +
                ", message='" + message + '\'' +
                ", uri='"+ uri + '\'' +
                '}';
    }
}
