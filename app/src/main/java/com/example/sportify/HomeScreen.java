package com.example.sportify;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends toolbar {
    NavigationView navigationView;
    ScrollView scrollView;

    LinearLayout linearLayout;
    ImageButton imagebutton;
    Button item;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        TextView seeAllNHL = findViewById(R.id.seeNHL);
        TextView seeAllEPL = findViewById(R.id.seeEPL);
        TextView seeAllF1 = findViewById(R.id.seef1);
        TextView seeAllCricket = findViewById(R.id.seeicc);
        TextView seeAllNBA = findViewById(R.id.seenba);
        TextView seeAllNFL = findViewById(R.id.seenfl);
        TextView seeAllUEFA = findViewById(R.id.seeuefa);
        navigationView = findViewById(R.id.nav_view);
        scrollView = findViewById(R.id.scroll);


        linearLayout = findViewById(R.id.linear);
        imagebutton = findViewById(R.id.menu_button);
        navigationView.setVisibility(View.INVISIBLE);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (navigationView.getVisibility() == View.VISIBLE) {
                    Animation animation = AnimationUtils.loadAnimation(HomeScreen.this, R.anim.slide);
                    navigationView.startAnimation(animation);
                    navigationView.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(HomeScreen.this, R.anim.slide2);
                navigationView.startAnimation(animation);
                navigationView.setVisibility(View.VISIBLE);
                navigationView.bringToFront();
                navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        if (item.getItemId() == R.id.button1) {
                            Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
                            startActivity(intent);
                            finish();
                            intent = new Intent(getApplicationContext(), HomeScreen.class);
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
        seeAllNHL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetailsNHL.class);
                startActivity(intent);
            }
        });
        seeAllEPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetailsEPL.class);
                startActivity(intent);
            }
        });
        seeAllF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetailsF1.class);
                startActivity(intent);
            }
        });
        seeAllCricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetailsCricket.class);
                startActivity(intent);
            }
        });
        seeAllNBA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetailsNBA.class);
                startActivity(intent);
            }
        });
        seeAllNFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetailsNFL.class);
                startActivity(intent);
            }
        });

        seeAllUEFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameDetailsUEFA.class);
                startActivity(intent);
            }
        });


    }
}
