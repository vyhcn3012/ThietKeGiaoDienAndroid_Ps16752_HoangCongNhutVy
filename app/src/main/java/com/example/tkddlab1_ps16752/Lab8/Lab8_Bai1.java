package com.example.tkddlab1_ps16752.Lab8;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.R;
import com.google.android.material.navigation.NavigationView;



public class Lab8_Bai1 extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab8_bai1);
        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case  R.id.nav_home:

                        Intent intent = new Intent(Lab8_Bai1.this, Lab8_Bai1.class);
                        startActivity(intent);
                        break;

                    case  R.id.nav_drawer1:
                        Toast.makeText(Lab8_Bai1.this, "Nav_Drawer1", Toast.LENGTH_SHORT).show();
                        break;
//                    case  R.id.nav_share:{
//
//                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
//                        sharingIntent.setType("text/plain");
//                        String shareBody =  "http://play.google.com/store/apps/detail?id=" + getPackageName();
//                        String shareSub = "Try now";
//                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
//                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
//                        startActivity(Intent.createChooser(sharingIntent, "Share using"));
//
//                    }
//                    break;
                }
                return false;
            }
        });
    }
    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }
}