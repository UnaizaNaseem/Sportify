package com.example.sportify;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends toolbar {
    NavigationView navigationView;
    ScrollView scrollView;

    LinearLayout linearLayout;
    ImageButton imagebutton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        TextView seeAll = findViewById(R.id.seeNHL);
        navigationView=findViewById(R.id.nav_view);
        scrollView=findViewById(R.id.scroll);
        linearLayout=findViewById(R.id.linear);
        imagebutton=findViewById(R.id.menu_button);
        navigationView.setVisibility(View.INVISIBLE);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(HomeScreen.this,R.anim.slide);
                navigationView.startAnimation(animation);
                navigationView.setVisibility(View.INVISIBLE);
            }
        });
        imagebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(HomeScreen.this,R.anim.slide2);
                navigationView.startAnimation(animation);
                navigationView.setVisibility(View.VISIBLE);
            }
        });
        seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetails.class);
                startActivity(intent);

            }
        });
    }
}
