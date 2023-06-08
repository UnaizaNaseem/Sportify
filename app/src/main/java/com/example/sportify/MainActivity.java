package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Button Login = (Button)findViewById(R.id.btn_login);
        Button SignUp= (Button)findViewById(R.id.btn_sign_in);
        Login.setOnClickListener(this::onClick);
        SignUp.setOnClickListener(this::onClick);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), home.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btn_login)
        {
            String str = "Login";
            Intent intent=new Intent(MainActivity.this,Registration.class);
            intent.putExtra("KEY",str);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btn_sign_in)
        {
            String str = "SignUp";
            Intent intent=new Intent(MainActivity.this,Registration.class);
            intent.putExtra("KEY",str);
            startActivity(intent);
        }

    }


}
