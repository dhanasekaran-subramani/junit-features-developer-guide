package com.ds2.junit.exception;

public class UserService {
    public User findByName(String name) throws UserNotFoundException {

        if ("".equals(name)) {
            throw new UserNotFoundException(666, "Name is empty!");
        }

        return new User(name);

    }
}