package com.example.tkddlab1_ps16752.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab6.Lab6_Bai1;
import com.example.tkddlab1_ps16752.Lab6.Lession_Lab6_Bai1;
import com.example.tkddlab1_ps16752.R;

public class Lesson_Lab7_Bai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_lab7_bai1);
    }

    public void openLab7Bai1(View view){
        Intent intent = new Intent(Lesson_Lab7_Bai1.this, Lab7_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}