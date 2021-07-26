package com.example.tkddlab1_ps16752.Lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class MainLab8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab8);
    }

    public void openMenuLab8(View view){
        Intent intent = new Intent(MainLab8.this, MenuLab8.class);
        startActivity(intent);
    }
}