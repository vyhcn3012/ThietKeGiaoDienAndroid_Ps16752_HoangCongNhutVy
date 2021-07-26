package com.example.tkddlab1_ps16752.Lab4;

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

public class MenuLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab4);
    }

    public void bai1Lab4Lesson(View view){
        Intent intent = new Intent(MenuLab4.this, Lession_Lab4_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab4Lesson(View view){
        Intent intent = new Intent(MenuLab4.this, Lession_Lab4_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai3Lab4Lesson(View view){
        Intent intent = new Intent(MenuLab4.this, Lession_Lab4_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai4Lab4Lesson(View view){
        Intent intent = new Intent(MenuLab4.this, Lesstion_Lab4_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai5Lab4Lesson(View view){
        Intent intent = new Intent(MenuLab4.this, Lession_Lab4_Bai5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}