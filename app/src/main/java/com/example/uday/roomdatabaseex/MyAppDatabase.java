package com.example.uday.roomdatabaseex;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


//This is a database class
@Database(entities = {User.class},version = 1)
public abstract class MyAppDatabase extends RoomDatabase {

    public abstract MyDao myDao();
}
