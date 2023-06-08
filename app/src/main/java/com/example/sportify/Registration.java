package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



        Button signup=(Button) findViewById(R.id.SignUp);
        Button login=(Button) findViewById(R.id.Login);

        login.setOnClickListener(this::onClick);
        signup.setOnClickListener(this::onClick);

        Intent intent = getIntent();
        String str = intent.getStringExtra("KEY");
        selectFragment(str);

    }
    void selectFragment(String str) {
        Button signup=(Button) findViewById(R.id.SignUp);
        Button login=(Button) findViewById(R.id.Login);

        if (str.equals("SignUp")) {
            signup.setBackgroundColor(android.graphics.Color.parseColor("#045961"));
            signup.setTextColor(Color.WHITE);
            login.setBackgroundColor(Color.WHITE);
            login.setTextColor(android.graphics.Color.parseColor("#045961"));
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container_view, new SignUpFragment());
            transaction.commit();
        } else if (str.equals("Login")) {
            login.setBackgroundColor(android.graphics.Color.parseColor("#045961"));
            login.setTextColor(Color.WHITE);
            signup.setBackgroundColor(Color.WHITE);
            signup.setTextColor(android.graphics.Color.parseColor("#045961"));

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container_view, new LoginFragment());
            transaction.commit();
        }
    }
    public void onClick(View v) {
        if(v.getId() == R.id.Login)
        {
            selectFragment("Login");
        }
        else if (v.getId() == R.id.SignUp)
        {
            selectFragment("SignUp");
        }

    }
}