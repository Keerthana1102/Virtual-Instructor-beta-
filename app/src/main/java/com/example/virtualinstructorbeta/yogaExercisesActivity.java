package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yogaExercisesActivity extends AppCompatActivity {

    Button btnExercisesBeginners;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_exercises);

        btnExercisesBeginners = (Button) findViewById(R.id.yoga_begin_exer);
        btnExercisesBeginners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (yogaExercisesActivity.this, ListExerciesBeginners.class);
                startActivity((intent));
            }
        });


    }
}
