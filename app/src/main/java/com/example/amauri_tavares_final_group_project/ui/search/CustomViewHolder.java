package com.example.amauri_tavares_final_group_project.ui.search;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amauri_tavares_final_group_project.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {


    public TextView  texCity,textAddress;
    public ImageButton simpleImageButton;
    public CardView cardView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        this.texCity = itemView.findViewById(R.id.texCity);
        this.textAddress = itemView.findViewById(R.id.textAddress);
        this.simpleImageButton = itemView.findViewById(R.id.simpleImageButton);
        this.cardView = itemView.findViewById(R.id.main_container);

    }
}
