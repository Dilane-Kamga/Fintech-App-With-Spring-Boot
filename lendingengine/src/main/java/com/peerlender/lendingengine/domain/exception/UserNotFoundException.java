package com.peerlender.lendingengine.domain.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String userName) {
        super("user with" +userName+ "not found");
    }
}
