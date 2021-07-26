package com.example.tkddlab1_ps16752.Lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai1;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai2;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai3;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai4;
import com.example.tkddlab1_ps16752.Lab2.MenuLab2;
import com.example.tkddlab1_ps16752.R;

public class MenuLab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab3);
    }

    public void bai1Lab3Lesson(View view){
        Intent intent = new Intent(MenuLab3.this, Slide3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab3Lesson(View view){
        Intent intent = new Intent(MenuLab3.this, SpinnerSllide3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai3Lab3Lesson(View view){
        Intent intent = new Intent(MenuLab3.this, GridViewLogo.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai4Lab3Lesson(View view){
        Intent intent = new Intent(MenuLab3.this, Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}