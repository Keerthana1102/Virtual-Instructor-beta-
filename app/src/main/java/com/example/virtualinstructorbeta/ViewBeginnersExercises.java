package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewBeginnersExercises extends AppCompatActivity {

      ImageView mainImageView;
      TextView title, description, benefits, precautions;

      String data1, data2, data3, data4;
      int myImage;

//    int image_id;
//    String name;
//
//      TextView timer, title;
//    ImageView detail_image;
//
//    Button btnStartExer;
//    Boolean isRunning = false;

    private TextView countdownText;
    private Button countdownButton;

    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 20000; // 20s
    private boolean timerRunning = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_beginners_exercises);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title_k);
        description = findViewById(R.id.description);
        benefits = findViewById(R.id.benefits);
        precautions = findViewById(R.id.precautions);

        getSupportActionBar().hide();

        getData();
        setData();

        countdownText = findViewById(R.id.countdown_text);
        countdownButton = findViewById(R.id.countdown_button);

        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStop();
            }
        });

        updateTimer();

//          timer = findViewById(R.id.timer);
//          //countDownTimer = findViewById(R.id.timer);
////        title = (TextView)findViewById(R.id.title);
////        detail_image = (ImageView)findViewById(R.id.mainImageView);
////
//          btnStartExer = findViewById(R.id.btnStartExer);
//          btnStartExer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!isRunning){
//                    btnStartExer.setText("DONE");
//                    countDownTimer = new CountDownTimer(20000, 1000){
//
//                        @Override
//                        public void onTick(long l) {
//                        //    timer.setText(""+1/1000);
//                            timeLeftInMilliseconds = l;
//                        }
//
//                        @Override
//                        public void onFinish() {
//
//                            // Ad's region
//                            Toast.makeText(ViewBeginnersExercises.this, "Great! This asana completed!!", Toast.LENGTH_SHORT).show();
//                            finish();
//                        }
//                    }.start();
//                }
//                else{
//                    // Ad's region
//                    Toast.makeText(ViewBeginnersExercises.this, "Great! This asana completed!!", Toast.LENGTH_SHORT).show();
//                    finish();
//                }
//
//                isRunning = ! isRunning;
//            }
//        });
//
//        timer.setText("20");


//        if(getIntent() != null){
//
//            image_id = getIntent().getIntExtra("image_id", -1);
//            name  = getIntent().getStringExtra("name");
//
//            detail_image.setImageResource(image_id);
//            title.setText(name);
//
//        }
//
//
    }

    public void startStop(){
        if(timerRunning){
            stopTimer();
        }
        else{
            startTimer();
        }
    }

    public void startTimer(){
        countDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMilliseconds = l;
                updateTimer();
            }

            @Override
            public void onFinish() {
               //  Ad's region
                countdownButton.setText("DONE");
                Toast.makeText(ViewBeginnersExercises.this, "Great! This asana completed!!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }.start();

        countdownButton.setText("PAUSE");
        timerRunning = true;
    }

    public void stopTimer(){
        countDownTimer.cancel();
        countdownButton.setText("START");
        timerRunning = false;
    }

    public void updateTimer(){
        int minutes = (int) timeLeftInMilliseconds / 60000;
        int seconds = (int) timeLeftInMilliseconds % 60000 / 1000;

        String timeLeftText;

        timeLeftText = "" + minutes;
        timeLeftText += ":";
        if(seconds<10){
            timeLeftText += "0";
        }
        timeLeftText += seconds;

        countdownText.setText(timeLeftText);
    }

    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            data4 = getIntent().getStringExtra("data4");
            myImage = getIntent().getIntExtra("myImage", 1);


        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){

        title.setText(data1);
        description.setText(data2);
        benefits.setText(data3);
        precautions.setText(data4);
        mainImageView.setImageResource(myImage);

    }
}
