package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.VirtualInstructor.mounteverest.UnityPlayerActivity;

public class unityHolder2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_holder2);

        Intent intent = new Intent(unityHolder2.this, UnityPlayerActivity.class);
        intent.putExtra("Key","Space");
        startActivity(intent);
    }
}
