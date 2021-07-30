package com.example.a30july_wepart;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    TextView mTvName;
    ImageView mIvAnimal;
    public AnimalViewHolder(@NonNull  View itemView) {
        super(itemView);
        initVIew(itemView);
    }

    private void initVIew(View itemview) {
        mIvAnimal = itemview.findViewById(R.id.ivAnimal);
        mTvName = itemview.findViewById(R.id.tvName);
    }

    public void setData(Animal animal){
        mTvName.setText(animal.getName());
        mIvAnimal.setImageResource(animal.getImageId());
    }
}
