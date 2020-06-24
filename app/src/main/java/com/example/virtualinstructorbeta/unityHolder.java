package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.VirtualInstructor.mounteverest.UnityPlayerActivity;
import com.unity3d.player.UnityPlayer;


public class unityHolder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_holder);

        Intent intent = new Intent(unityHolder.this, UnityPlayerActivity.class);
        intent.putExtra("Key","MountEverest");
        startActivity(intent);

    }

}
