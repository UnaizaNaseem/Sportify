package com.example.sportify;

import static com.example.sportify.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_game_details);
        Button upcoming = (Button) findViewById(id.Upcoming);
        Button past = (Button) findViewById(id.Past);
        Button standings = (Button) findViewById(id.Standings);

        upcoming.setOnClickListener(this::onClick);
        past.setOnClickListener(this::onClick);
        standings.setOnClickListener(this::onClick);

        selectFragment("Upcoming");
    }

    public void onClick(View v) {
        if (v.getId() == id.Upcoming) {
            selectFragment("Upcoming");
        }
        else if (v.getId() == id.Past) {
            selectFragment("Past");
        }
        else if (v.getId() == id.Standings) {
            selectFragment("Standings");
        }
    }

    void selectFragment(String str) {
        Button upcoming = (Button) findViewById(id.Upcoming);
        Button past = (Button) findViewById(id.Past);
        Button standings = (Button) findViewById(id.Standings);

        if (str=="Upcoming") {
            upcoming.setBackgroundColor(ContextCompat.getColor(this, color.teal_700));
            past.setBackgroundColor(ContextCompat.getColor(this, color.white));
            standings.setBackgroundColor(ContextCompat.getColor(this, color.white));
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(id.fragmentContanier, new GameDetailsUpcoming());
            transaction.commit();
        }
        else if (str=="Past") {
            past.setBackgroundColor(ContextCompat.getColor(this, color.teal_700));
            upcoming.setBackgroundColor(ContextCompat.getColor(this, color.white));
            standings.setBackgroundColor(ContextCompat.getColor(this, color.white));

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(id.fragmentContanier, new GameDetailsPast());
            transaction.commit();
        } else if (str=="Standings") {
           standings.setBackgroundColor(ContextCompat.getColor(this, color.teal_700));
            upcoming.setBackgroundColor(ContextCompat.getColor(this, color.white));
            past.setBackgroundColor(ContextCompat.getColor(this, color.white));

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(id.fragmentContanier, new GameDetailsStandings());
            transaction.commit();
        }
    }


}
