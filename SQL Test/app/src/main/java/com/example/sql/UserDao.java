package com.example.sql;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {
        @Insert
        void insert(User user);

        @Insert
        void insertAll(User... users);

        @Update
        void update(User user);

        @Delete
        void delete(User user);

        @Query("SELECT * FROM user")
        List<User> getAllUsers();

        @Query("SELECT * FROM user WHERE name = :userName")
        List<User> findUsersByName(String userName);

        @Query("DELETE FROM user")
        void deleteAll();


}