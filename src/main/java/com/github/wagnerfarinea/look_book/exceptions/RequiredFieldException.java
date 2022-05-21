package com.github.wagnerfarinea.look_book.exceptions;

public class RequiredFieldException extends RuntimeException {

    public RequiredFieldException(String attribute) {
        super(String.format("%s is required", attribute));
    }
}
