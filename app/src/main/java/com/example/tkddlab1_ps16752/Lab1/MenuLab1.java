package com.example.tkddlab1_ps16752.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class MenuLab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab1);
    }

    public void bai1Lab1Lesson(View view){
        Intent intent = new Intent(MenuLab1.this, Lession_Lab1_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab1Lesson(View view){
        Intent intent = new Intent(MenuLab1.this, Lession_Lab1_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai3Lab1Lesson(View view){
        Intent intent = new Intent(MenuLab1.this, Lession_Lab1_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai4Lab1Lesson(View view){
        Intent intent = new Intent(MenuLab1.this, Lession_Lab1_bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}