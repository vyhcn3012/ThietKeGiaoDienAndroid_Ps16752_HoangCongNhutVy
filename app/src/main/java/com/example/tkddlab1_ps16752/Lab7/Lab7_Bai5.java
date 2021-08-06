package com.example.tkddlab1_ps16752.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab6.Lab6_Bai3;
import com.example.tkddlab1_ps16752.Lab6.MenuLab6;
import com.example.tkddlab1_ps16752.R;

public class Lab7_Bai5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7_bai5);
    }

    public void openMenu7(View view){
        Intent intent = new Intent(Lab7_Bai5.this, MenuLab7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}