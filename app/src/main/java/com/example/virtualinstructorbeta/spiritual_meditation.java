package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class spiritual_meditation extends AppCompatActivity {

    LinearLayout linearLayout;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiritual_meditation);


        linearLayout = (LinearLayout) findViewById(R.id.descriptionSM);
        cardView = (CardView) findViewById(R.id.space);



        linearLayout.setTranslationY(800f);
        description_Sm();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(spiritual_meditation.this,unityHolder2.class);
                startActivity(i);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void description_Sm(){

        linearLayout.animate().translationYBy(-800f).setDuration(3000);
    }
}
