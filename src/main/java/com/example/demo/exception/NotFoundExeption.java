package com.example.demo.exception;

public class NotFoundExeption extends RuntimeException {
    private String detail;

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public NotFoundExeption(String detail, String message) {
        this.detail = detail;
        this.message = message;
    }

    public NotFoundExeption(String message, String detail, String message1) {
        super(message);
        this.detail = detail;
        this.message = message1;
    }

    public NotFoundExeption(String message, Throwable cause, String detail, String message1) {
        super(message, cause);
        this.detail = detail;
        this.message = message1;
    }

    public NotFoundExeption(Throwable cause, String detail, String message) {
        super(cause);
        this.detail = detail;
        this.message = message;
    }

    public NotFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String detail, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.detail = detail;
        this.message = message1;
    }

    @Override
    public String toString() {
        return "NotFoundExeption{" +
                "detail='" + detail + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
