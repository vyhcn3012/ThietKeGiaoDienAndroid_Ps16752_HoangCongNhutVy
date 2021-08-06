package com.example.tkddlab1_ps16752.Lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab7.Lession_Lab7_Bai2;
import com.example.tkddlab1_ps16752.Lab7.Lesson_Lab7_Bai1;
import com.example.tkddlab1_ps16752.Lab7.MenuLab7;
import com.example.tkddlab1_ps16752.R;

public class MenuLab8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab8);
    }

    public void bai1Lab8Lesson(View view){
        Intent intent = new Intent(MenuLab8.this, Lab8_Bai1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void bai2Lab8Lesson(View view){
        Intent intent = new Intent(MenuLab8.this, Lab8_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

}