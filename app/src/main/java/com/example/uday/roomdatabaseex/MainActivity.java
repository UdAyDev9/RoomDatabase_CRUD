package com.example.uday.roomdatabaseex;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static MyAppDatabase myAppDatabase;
    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        //Database Builder
        myAppDatabase = Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,"KrishnAdb").allowMainThreadQueries().build();

        if(findViewById(R.id.fragmentContainer) != null){
            if(savedInstanceState != null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragmentContainer,new HomeFragment()).commit();
        }


    }
}
