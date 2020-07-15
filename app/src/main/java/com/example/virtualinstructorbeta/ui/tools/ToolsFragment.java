package com.example.virtualinstructorbeta.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.virtualinstructorbeta.R;
import com.example.virtualinstructorbeta.Videos.video1_m;
import com.example.virtualinstructorbeta.instructor_info;

public class ToolsFragment extends Fragment {

    private CardView cardView;
    private HorizontalScrollView scrollView_m;
    private HorizontalScrollView scrollView_y;
    private TextView textView;

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tools, container, false);



        cardView = (CardView) root.findViewById(R.id.trikonasana);
        scrollView_m = root.findViewById(R.id.video_grp1);
        scrollView_y = root.findViewById(R.id.video_grp2);
        textView = root.findViewById(R.id.instructor_info);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), video1_m.class);
                startActivity(i);
            }
        });

        scrollView_y.setHorizontalScrollBarEnabled(false);
        scrollView_m.setHorizontalScrollBarEnabled(false);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), instructor_info.class);
                startActivity(i);
            }
        });




        return root;
    }
}