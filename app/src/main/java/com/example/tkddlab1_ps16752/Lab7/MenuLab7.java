package com.example.tkddlab1_ps16752.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab6.Lession_Lab6_Bai1;
import com.example.tkddlab1_ps16752.Lab6.MenuLab6;
import com.example.tkddlab1_ps16752.R;

public class MenuLab7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab7);
    }

    public void bai1Lab7Lesson(View view){
        Intent intent = new Intent(MenuLab7.this, Lesson_Lab7_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab7Lesson(View view){
        Intent intent = new Intent(MenuLab7.this, Lession_Lab7_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai3Lab7Lesson(View view){
        Intent intent = new Intent(MenuLab7.this, Lession_Lab7_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai4Lab7Lesson(View view){
        Intent intent = new Intent(MenuLab7.this, Lession_Lab7_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai5Lab7Lesson(View view){
        Intent intent = new Intent(MenuLab7.this, Lession_Lab7_Bai5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}