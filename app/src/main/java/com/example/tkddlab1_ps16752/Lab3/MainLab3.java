package com.example.tkddlab1_ps16752.Lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class MainLab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab3);
    }

    public void openMenuLab3(View view){
        Intent intent = new Intent(MainLab3.this, MenuLab3.class);
        startActivity(intent);
    }
}