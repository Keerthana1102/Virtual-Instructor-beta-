package com.example.virtualinstructorbeta.Videos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.StatusBarManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.virtualinstructorbeta.R;

public class video1_m extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1_m);

        getSupportActionBar().hide();

        videoView = (VideoView) findViewById(R.id.video1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/virtual-instructor.appspot.com/o/greenish_blue_butterfly_butterfly_523.mp4?alt=media&token=7e07a46b-41fe-45e9-bb9a-dfff808df3a0");


        if(mediaController == null){
            mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
        }

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        //videoView.setLayoutParams(params);
        videoView.start();


        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(video1_m.this, "Completed", Toast.LENGTH_SHORT).show();
            }
        });
        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(video1_m.this, "Some error occurred", Toast.LENGTH_SHORT).show();
                Log.d(TAG,"not working");
                return false;
            }
        });

    }

}
