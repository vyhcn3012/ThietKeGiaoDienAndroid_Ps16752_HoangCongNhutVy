package com.example.tkddlab1_ps16752.Lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab2.Lab2_Bai2;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai2;
import com.example.tkddlab1_ps16752.R;

public class Lession_Lab4_Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_lab4_bai2);
    }

    public void openLab4Bai2(View view){
        Intent intent = new Intent(Lession_Lab4_Bai2.this, Lab4_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}