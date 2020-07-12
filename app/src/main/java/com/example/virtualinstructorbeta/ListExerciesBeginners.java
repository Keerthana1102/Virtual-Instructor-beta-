package com.example.virtualinstructorbeta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.virtualinstructorbeta.Adapter.MyAdapter;
//import com.example.virtualinstructorbeta.Adapter.RecyclerViewAdapter;
import com.example.virtualinstructorbeta.Model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ListExerciesBeginners extends AppCompatActivity {

    RecyclerView recyclerView1;


    String s1[];
    int images[] = {R.drawable.tadasana, R.drawable.vrikshasana, R.drawable.adho_mukho_svanasana,
                    R.drawable.trikonasana, R.drawable.kursiasana, R.drawable.naukasana,
                    R.drawable.bhujangasana, R.drawable.paschimottanasana, R.drawable.balasana};

//    List<Exercise> exerciseList = new ArrayList<>();
//    RecyclerView.LayoutManager layoutManager;
//    RecyclerView recyclerView;
//    RecyclerViewAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercies_beginners);

        recyclerView1 = findViewById(R.id.recyclerView1);
        s1 = getResources().getStringArray(R.array.beginners_exercies);

        MyAdapter myAdapter = new MyAdapter(this, s1, images);
        recyclerView1.setAdapter(myAdapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().hide();



//        initData();
//
//        recyclerView = (RecyclerView) findViewById(R.id.list_ex);
//        adapter = new RecyclerViewAdapter(exerciseList, getBaseContext());
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
    }

//    private void initData() {
//
//        exerciseList.add(new Exercise(R.drawable.tadasana, "Tadasana"));
//        exerciseList.add(new Exercise(R.drawable.vrikshasana, "Vrikshasana"));
//        exerciseList.add(new Exercise(R.drawable.adho_mukho_svanasana, "Adho Mukho Svanasana"));
//        exerciseList.add(new Exercise(R.drawable.trikonasana, "Trikonasana"));
//        exerciseList.add(new Exercise(R.drawable.kursiasana, "Kursiasana"));
//        exerciseList.add(new Exercise(R.drawable.naukasana, "Naukasana"));
//        exerciseList.add(new Exercise(R.drawable.bhujangasana, "Bhujangasana"));
//        exerciseList.add(new Exercise(R.drawable.paschimottanasana, "Paschimottanasana"));
//        exerciseList.add(new Exercise(R.drawable.balasana, "Balasana"));
//    }
}
