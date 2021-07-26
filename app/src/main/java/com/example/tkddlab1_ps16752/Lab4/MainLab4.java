package com.example.tkddlab1_ps16752.Lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class MainLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab4);
    }

    public void openMenuLab4(View view){
        Intent intent = new Intent(MainLab4.this, MenuLab4.class);
        startActivity(intent);
    }
}