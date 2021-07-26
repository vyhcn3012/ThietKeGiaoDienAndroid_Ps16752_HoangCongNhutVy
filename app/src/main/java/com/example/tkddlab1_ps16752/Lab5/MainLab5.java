package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class MainLab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab5);
    }

    public void openMenuLab5(View view){
        Intent intent = new Intent(MainLab5.this, MenulLab5.class);
        startActivity(intent);
    }
}