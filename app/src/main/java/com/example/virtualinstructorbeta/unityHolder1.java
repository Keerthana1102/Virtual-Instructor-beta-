package com.example.virtualinstructorbeta;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


import com.VirtualInstructor.mounteverest.UnityPlayerActivity;
import com.unity3d.player.UnityPlayer;



public class unityHolder1 extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_holder1);

        Intent intent = new Intent (unityHolder1.this, UnityPlayerActivity.class);
        intent.putExtra("Key","Forest");
        startActivity(intent);

    }
}
