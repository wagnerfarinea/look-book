package com.github.wagnerfarinea.look_book.exceptions;

public class InvalidFieldSizeException extends RuntimeException {

    public InvalidFieldSizeException(String attribute, long size) {
        super(String.format("%s must be longer than %d characters", attribute, size));
    }

}
