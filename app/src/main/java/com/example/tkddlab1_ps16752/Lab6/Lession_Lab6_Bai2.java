package com.example.tkddlab1_ps16752.Lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class Lession_Lab6_Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_lab6_bai2);
    }

    public void openLab6Bai2(View view){
        Intent intent = new Intent(Lession_Lab6_Bai2.this, Lab6_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}