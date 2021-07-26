package com.example.tkddlab1_ps16752.Lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.tkddlab1_ps16752.Lab2.Lab2_Bai2;
import com.example.tkddlab1_ps16752.Lab2.Lab2_Bai3;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai3;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai4;
import com.example.tkddlab1_ps16752.R;

public class Lab4_Bai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_bai3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setLogo(R.drawable.lab1_3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.bottom_navigation,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.nav_home){
            Intent intent = new Intent(Lab4_Bai3.this, MenuLab4.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
        }
        return super.onOptionsItemSelected(item);
    }

    public void bai4Lab3Lesson(View view){
        Intent intent = new Intent(Lab4_Bai3.this, Lesstion_Lab4_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}