package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai1;
import com.example.tkddlab1_ps16752.Lab2.MenuLab2;
import com.example.tkddlab1_ps16752.R;

public class MenulLab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menul_lab5);
    }

    public void bai1Lab5Lesson(View view){
        Intent intent = new Intent(MenulLab5.this, Lession_Lab5_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab5Lesson(View view){
        Intent intent = new Intent(MenulLab5.this, Lession_Lab5_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai3Lab5Lesson(View view){
        Intent intent = new Intent(MenulLab5.this, Lession_Lab5_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai4Lab5Lesson(View view){
        Intent intent = new Intent(MenulLab5.this, Lession_Lab5_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}