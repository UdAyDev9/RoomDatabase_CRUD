package com.example.uday.roomdatabaseex;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;



@Entity(tableName = "users")//This is our table name
public class User {

    @PrimaryKey
    private int id;


    @ColumnInfo(name = "user_name")//This is our column name
    private String name;

    @ColumnInfo(name = "user_email")
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
