package com.example.tkddlab1_ps16752.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class MainLab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab1);
    }

    public void openMenuLab1(View view){
        Intent intent = new Intent(MainLab1.this, MenuLab1.class);
        startActivity(intent);
    }
}