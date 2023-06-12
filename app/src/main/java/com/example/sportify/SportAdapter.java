package com.example.sportify;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class SportAdapter extends ArrayAdapter<Sport> {
    private Context context;
    private List<com.example.sportify.Sport> sportsList;

    public SportAdapter(Context context, List<com.example.sportify.Sport> sportsList) {
        super(context,0,sportsList);
        this.context = context;
        this.sportsList = sportsList;
    }



    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_sport, parent, false);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.img_sport);
            holder.button = convertView.findViewById(R.id.btn_sport);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final com.example.sportify.Sport currentSport = sportsList.get(position);

        holder.imageView.setImageResource(currentSport.getImageRes());
        holder.button.setText(currentSport.getName());

        if (currentSport.isFavorite()) {
            holder.button.setBackgroundColor(ContextCompat.getColor(context, R.color.grey));
        } else {
            holder.button.setBackgroundColor(Color.TRANSPARENT);
        }

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentSport.isFavorite()) {
                    currentSport.setFavorite(false);
                    v.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    if (countFavorites(sportsList) < 3) {
                        currentSport.setFavorite(true);
                        v.setBackgroundColor(ContextCompat.getColor(context, R.color.grey));
                    } else {
                        Toast.makeText(context, "You can only select up to three favorites.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        return convertView;
    }


    private static class ViewHolder {
        ImageView imageView;
        Button button;
    }

    private int countFavorites(List<com.example.sportify.Sport> sportsList) {
        int count = 0;
        for (com.example.sportify.Sport sport : sportsList) {
            if (sport.isFavorite()) {
                count++;
            }
        }
        return count;
    }
}




