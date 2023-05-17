package com.example.skypro.proskyskyprospringexceptiondemo.exceptions;

public class BadPersonNumberException extends RuntimeException{
    public BadPersonNumberException() {
    }

    public BadPersonNumberException(String message) {
        super(message);
    }

    public BadPersonNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadPersonNumberException(Throwable cause) {
        super(cause);
    }

    public BadPersonNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
