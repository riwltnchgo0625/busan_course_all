package com.example.busanapp.HelperClasses.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.busanapp.R;

import java.util.ArrayList;

public class MostViewedAdapter extends RecyclerView.Adapter<MostViewedAdapter.MostViewedViewHolder> {
    private ArrayList<MostViewedHelperClass> mostViewedLocations;

    public MostViewedAdapter(ArrayList<MostViewedHelperClass> mostViewedLocations) {
        this.mostViewedLocations = mostViewedLocations;
    }

    @NonNull
    @Override
    public MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design, parent, false);
        return new MostViewedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        MostViewedHelperClass helperClass = mostViewedLocations.get(position);

//      holder.imageView.setImageResource(helperClass.getImageView());
        Glide.with(holder.itemView.getContext()).load(helperClass.getUrl()).into(holder.imageView);
        holder.titleText.setText(helperClass.getTitle());
        holder.descText.setText(helperClass.getDescription());
    }

    @Override
    public int getItemCount() {
        return mostViewedLocations.size();
    }

    static class MostViewedViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleText, descText;

        MostViewedViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.mv_image);
            titleText = itemView.findViewById(R.id.mv_title);
            descText = itemView.findViewById(R.id.mv_desc);
        }
    }
}