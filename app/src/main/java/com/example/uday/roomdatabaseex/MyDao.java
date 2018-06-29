package com.example.uday.roomdatabaseex;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDao {

    //To insert
    @Insert
    public void addUser(User user);

    //Used to write query
    @Query("select * from users")
    public List<User> getUsers();

    //To delete
    @Delete
    public void deleteUser(User user);

    //To update
    @Update
    public void updateUser(User user);



}
