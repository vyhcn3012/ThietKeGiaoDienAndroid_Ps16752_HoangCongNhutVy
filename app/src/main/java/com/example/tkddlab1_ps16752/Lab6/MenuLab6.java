package com.example.tkddlab1_ps16752.Lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab5.Lession_Lab5_Bai1;
import com.example.tkddlab1_ps16752.Lab5.MenulLab5;
import com.example.tkddlab1_ps16752.R;

public class MenuLab6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab6);
    }

    public void bai1Lab6Lesson(View view){
        Intent intent = new Intent(MenuLab6.this, Lession_Lab6_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab6Lesson(View view){
        Intent intent = new Intent(MenuLab6.this, Lession_Lab6_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai3Lab6Lesson(View view){
        Intent intent = new Intent(MenuLab6.this,Lab6_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}