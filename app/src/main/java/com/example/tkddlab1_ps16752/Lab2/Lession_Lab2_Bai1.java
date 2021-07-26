package com.example.tkddlab1_ps16752.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab1.Lab1_Bai1;
import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_Bai1;
import com.example.tkddlab1_ps16752.R;

public class Lession_Lab2_Bai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_lab2_bai1);
    }

    public void openLab2Bai1(View view){
        Intent intent = new Intent(Lession_Lab2_Bai1.this, Lab2_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}