package com.template.exceptions;

public class NoUniqueDataException extends RuntimeException{
    public NoUniqueDataException(String message) {
        super(message);
    }
}
