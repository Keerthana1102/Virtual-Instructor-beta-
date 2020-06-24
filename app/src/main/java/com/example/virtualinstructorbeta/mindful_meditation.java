package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.unity3d.player.UnityPlayer;

public class mindful_meditation extends AppCompatActivity {

    LinearLayout linearLayout;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindful_meditation);

        linearLayout = (LinearLayout) findViewById(R.id.descriptionMM);
        cardView = (CardView) findViewById(R.id.forest);


        linearLayout.setTranslationY(800f);
        description_Fm();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mindful_meditation.this, unityHolder1.class);
                startActivity(i);
            }
        });
    }

    private void description_Fm(){

        linearLayout.animate().translationYBy(-800f).setDuration(3000);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
