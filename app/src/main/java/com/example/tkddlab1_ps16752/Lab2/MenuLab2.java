package com.example.tkddlab1_ps16752.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_Bai1;
import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_Bai2;
import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_Bai3;
import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_bai4;
import com.example.tkddlab1_ps16752.Lab1.MenuLab1;
import com.example.tkddlab1_ps16752.R;

public class MenuLab2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab2);
    }

    public void bai1Lab2Lesson(View view){
        Intent intent = new Intent(MenuLab2.this, Lession_Lab2_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab2Lesson(View view){
        Intent intent = new Intent(MenuLab2.this, Lession_Lab2_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai3Lab2Lesson(View view){
        Intent intent = new Intent(MenuLab2.this, Lession_Lab2_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai4Lab2Lesson(View view){
        Intent intent = new Intent(MenuLab2.this, Lession_Lab2_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}