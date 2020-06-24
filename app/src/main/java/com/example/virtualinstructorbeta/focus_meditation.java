package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.unity3d.player.UnityPlayer;


import static com.unity3d.player.UnityPlayer.UnitySendMessage;


public class focus_meditation extends AppCompatActivity {


    LinearLayout linearLayout;
    CardView cardView;
    private String TAG;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus_meditation);

        linearLayout = (LinearLayout) findViewById(R.id.descriptionFM);
        cardView = (CardView) findViewById(R.id.mountEverest);



        linearLayout.setTranslationY(800f);
        description_Fm();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(focus_meditation.this, unityHolder.class);
                startActivity(i);

            }
        });

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void description_Fm(){

        linearLayout.animate().translationYBy(-800f).setDuration(3000);
    }
}
