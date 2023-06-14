package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.google.android.material.navigation.NavigationView;

public class NewsScreen extends AppCompatActivity {
    NavigationView navigationView;
    ScrollView scrollView;

    LinearLayout linearLayout;
    ImageButton imagebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_screen);
        navigationView=findViewById(R.id.nav_view);
        scrollView=findViewById(R.id.scroll);

        linearLayout=findViewById(R.id.linear);
        imagebutton=findViewById(R.id.menu_button);
        navigationView.setVisibility(View.INVISIBLE);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerView, new frag4());
        transaction.commit();
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (navigationView.getVisibility()==View.VISIBLE){
                    Animation animation= AnimationUtils.loadAnimation(NewsScreen.this,R.anim.slide);
                    navigationView.startAnimation(animation);
                    navigationView.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(NewsScreen.this,R.anim.slide2);
                navigationView.startAnimation(animation);
                navigationView.setVisibility(View.VISIBLE);
            }
        });

    }




    }


