package com.example.virtualinstructorbeta;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


public class register_activity extends AppCompatActivity {

    Timer timer ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                openMain();
                finish();
            }
        },2000);
    }


    public void openMain() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }






}