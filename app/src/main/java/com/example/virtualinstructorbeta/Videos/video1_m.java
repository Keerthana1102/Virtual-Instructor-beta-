package com.example.virtualinstructorbeta.Videos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.virtualinstructorbeta.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class video1_m extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;
    private String TAG;
    private ProgressDialog pd;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1_m);

        getSupportActionBar().hide();

        pd = new ProgressDialog(this);
        pd.setMessage("Loading video please wait...");
        pd.show();

        videoView = (VideoView) findViewById(R.id.video1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/virtual-instructor.appspot.com/o/Trikonasana%5B1%5D.mp4?alt=media&token=bf93d9cf-0772-437c-854a-6e5b0fe2cda3");


        if(mediaController == null){
            mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
        }

        DisplayMetrics metrics = new DisplayMetrics(); getWindowManager().getDefaultDisplay().getMetrics(metrics);
        android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) videoView.getLayoutParams();
        params.width =  metrics.widthPixels;
        params.height = metrics.heightPixels;
        params.leftMargin = 0;
        videoView.setLayoutParams(params);

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

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                pd.hide();
            }
        });

    }

}
