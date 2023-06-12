package com.example.sportify;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

//public class toolbar extends AppCompatActivity {
//    DrawerLayout dLayout = (DrawerLayout) findViewById(R.id.nav_view);
//    boolean isOpen;
//
//    public void onCreateDrawer(Bundle savedInstanceState) {
//        {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_toolbar);
//            ImageButton menu = (ImageButton) findViewById(R.id.menu_button);
//
//            menu.setOnClickListener(this::onClick);
//        }
//
//    }
//        private void onClick (View v)
//        {
//            isOpen = dLayout.isDrawerOpen(GravityCompat.END);
//            if (isOpen == true) {
//                dLayout.closeDrawer(GravityCompat.END);
//            } else {
//                dLayout.openDrawer(GravityCompat.START);
//            }
//        }
//    }
//


//public class toolbar extends AppCompatActivity {
//    Boolean isOpen;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//        View view = View.inflate(this, R.layout.activity_toolbar, null);
//        setContentView(R.layout.activity_toolbar);
//        DrawerLayout dLayout = (DrawerLayout) v.findViewById(R.id.drawer_layout);
//        NavigationView navigationView = (NavigationView) v.findViewById(R.id.nav_view);
//        isOpen = dLayout.isDrawerOpen(GravityCompat.END);
//        if (isOpen == true) {
//            dLayout.closeDrawer(GravityCompat.END);
//        } else
//        {
//            dLayout.openDrawer(GravityCompat.START);
//        }
//    }
//}



public class toolbar extends AppCompatActivity {
    private DrawerLayout mDrawer;
    private DrawerLayout toolbar;
    private NavigationView nvDrawer;

    // Make sure to be using androidx.appcompat.app.ActionBarDrawerToggle version.
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

    }
}