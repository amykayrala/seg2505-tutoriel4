package com.example.sql;


public class TestUtil {
    public static User createUser(int id) {
        User user = new User();
        user.setId(id);
        user.setName("Test User");
        return user;
    }
}
