package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab2.Lab2_Bai1;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai1;
import com.example.tkddlab1_ps16752.R;

public class Lession_Lab5_Bai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_lab5_bai1);
    }

    public void openLab5Bai1(View view){
        Intent intent = new Intent(Lession_Lab5_Bai1.this, Lab5_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}