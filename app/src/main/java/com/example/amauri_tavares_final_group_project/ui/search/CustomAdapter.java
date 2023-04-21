package com.example.amauri_tavares_final_group_project.ui.search;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amauri_tavares_final_group_project.R;
import com.example.amauri_tavares_final_group_project.ui.SelectListener;

import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private Context contex;
    private List<HouseSearchModel> list;
    private  SelectListener listener;



    public CustomAdapter(Context contex, List<HouseSearchModel> list, SelectListener listener) {
        this.contex = contex;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(contex).inflate(R.layout.single_items, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.texCity.setText(list.get(position).getCity());
        holder.textAddress.setText(list.get(position).getAddress());
       // holder.simpleImageButton.setImageResource(R.drawable.home1);
        holder.simpleImageButton.setImageResource(list.get(position).getImgHouse());

        Log.v("SEARCH","onBindViewHolder");

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(list.get(position));

            }
        });

        holder.simpleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(list.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void filterList (List<HouseSearchModel> filterList){

        list = filterList;
        notifyDataSetChanged();


    }
}
