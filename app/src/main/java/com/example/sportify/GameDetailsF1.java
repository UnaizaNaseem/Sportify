package com.example.sportify;

import static com.example.sportify.R.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.google.android.material.navigation.NavigationView;

public class GameDetailsF1 extends toolbar {
    NavigationView navigationView;
    ScrollView scrollView;

    LinearLayout linearLayout;
    ImageButton imagebutton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_game_details_f1);
        Button upcoming = (Button) findViewById(id.Upcoming);
        Button past = (Button) findViewById(id.Past);
        Button standings = (Button) findViewById(id.Standings);

        upcoming.setOnClickListener(this::onClick);
        past.setOnClickListener(this::onClick);
        standings.setOnClickListener(this::onClick);

        selectFragment("Upcoming");
        navigationView=findViewById(R.id.nav_view);
        scrollView=findViewById(R.id.scroll);

        linearLayout=findViewById(R.id.linear);
        imagebutton=findViewById(R.id.menu_button);
        navigationView.setVisibility(View.INVISIBLE);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (navigationView.getVisibility()==View.VISIBLE){
                    Animation animation= AnimationUtils.loadAnimation(GameDetailsF1.this,R.anim.slide);
                    navigationView.startAnimation(animation);
                    navigationView.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(GameDetailsF1.this, R.anim.slide2);
                navigationView.startAnimation(animation);
                navigationView.setVisibility(View.VISIBLE);
                navigationView.bringToFront();
                navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        if (item.getItemId() == R.id.button1) {
                            Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
                            startActivity(intent);
                        }
                        else if (item.getItemId() == R.id.button2) {
                            Intent intent = new Intent(getApplicationContext(), GameDetailsCricket.class);
                            startActivity(intent);
                        }
                        else if (item.getItemId() == R.id.button3) {
                            Intent intent = new Intent(getApplicationContext(), GameDetailsEPL.class);
                            startActivity(intent);
                        }

                        else if (item.getItemId() == R.id.button5) {
                            Intent intent = new Intent(getApplicationContext(), GameDetailsF1.class);
                            startActivity(intent);
                        }
                        else if (item.getItemId() == R.id.button6) {
                            Intent intent = new Intent(getApplicationContext(), GameDetailsUEFA.class);
                            startActivity(intent);
                        }
                        else if (item.getItemId() == R.id.button7) {
                            Intent intent = new Intent(getApplicationContext(), GameDetailsNBA.class);
                            startActivity(intent);
                        }
                        else if (item.getItemId() == R.id.button8) {
                            Intent intent = new Intent(getApplicationContext(), GameDetailsNHL.class);
                            startActivity(intent);
                        }
                        else if (item.getItemId() == R.id.button9) {
                            Intent intent = new Intent(getApplicationContext(), GameDetailsNFL.class);
                            startActivity(intent);
                        }
                        else if (item.getItemId() == R.id.button10) {
                            Intent intent = new Intent(getApplicationContext(),NewsScreen.class);
                            startActivity(intent);
                        }

                        return false;
                    }
                });
            }
        });

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
            transaction.replace(id.fragmentContanier, new GameDetailsF1Upcoming());
            transaction.commit();
        }
        else if (str=="Past") {
            past.setBackgroundColor(ContextCompat.getColor(this, color.teal_700));
            upcoming.setBackgroundColor(ContextCompat.getColor(this, color.white));
            standings.setBackgroundColor(ContextCompat.getColor(this, color.white));

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(id.fragmentContanier, new GameDetailsF1Past());
            transaction.commit();
        } else if (str=="Standings") {
            standings.setBackgroundColor(ContextCompat.getColor(this, color.teal_700));
            upcoming.setBackgroundColor(ContextCompat.getColor(this, color.white));
            past.setBackgroundColor(ContextCompat.getColor(this, color.white));

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(id.fragmentContanier, new GameDetailsF1Standings());
            transaction.commit();
        }
    }


}
