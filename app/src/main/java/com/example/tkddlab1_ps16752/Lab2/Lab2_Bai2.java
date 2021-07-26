package com.example.tkddlab1_ps16752.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab1.Lab1_Bai2;
import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_Bai3;
import com.example.tkddlab1_ps16752.R;

public class Lab2_Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai2);
    }

    public void bai3Lab2Lesson(View view){
        Intent intent = new Intent(Lab2_Bai2.this, Lession_Lab2_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}