package com.example.virtualinstructorbeta.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.virtualinstructorbeta.Interface.ItemClickListener;
import com.example.virtualinstructorbeta.Model.Exercise;
import com.example.virtualinstructorbeta.R;
import com.example.virtualinstructorbeta.ViewBeginnersExercises;

import java.util.List;

//public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder{
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//        }
//    }
//}

//class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//
//
//    public ImageView image;
//    public TextView text;
//
//    private ItemClickListener itemClickListener;
//
//    public RecyclerViewHolder(@NonNull View itemView) {
//        super(itemView);
//        image = (ImageView)itemView.findViewById(R.id.ex_img);
//        text = (TextView) itemView.findViewById(R.id.ex_name);
//
//        itemView.setOnClickListener(this);
//    }
//
//    public void setItemClickListener(ItemClickListener itemClickListener) {
//        this.itemClickListener = itemClickListener;
//    }
//
//    @Override
//    public void onClick(View v) {
//        itemClickListener.onCLick(v, getAdapterPosition());
//    }
//}
//
//
//public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{
//
//    private List<Exercise> exerciseList;
//    private Context context;
//
//    public RecyclerViewAdapter(List<Exercise> exerciseList, Context context) {
//        this.exerciseList = exerciseList;
//        this.context = context;
//    }
//
//    @NonNull
//    @Override
//    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        View itemView = inflater.inflate(R.layout.item_exercise, parent, false);
//
//        return new RecyclerViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
//
//        holder.image.setImageResource(exerciseList.get(position).getImage_id());
//        holder.text.setText(exerciseList.get(position).getName());
//
//        holder.setItemClickListener(new ItemClickListener() {
//            @Override
//            public void onCLick(View view, int position) {
//                // Call to Activity
//                Intent intent = new Intent(context, ViewBeginnersExercises.class);
//                intent.putExtra("image_id", exerciseList.get(position).getImage_id());
//                intent.putExtra("name", exerciseList.get(position).getName());
//                context.startActivity(intent);
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//
//        return exerciseList.size();
//    }
//}
