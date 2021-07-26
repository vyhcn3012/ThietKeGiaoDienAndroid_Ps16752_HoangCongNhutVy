package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab4.Lab4_Bai4;
import com.example.tkddlab1_ps16752.Lab4.Lesstion_Lab4_Bai4;
import com.example.tkddlab1_ps16752.R;

public class Lession_Lab5_Bai4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_lab5_bai4);
    }

    public void openLab5Bai4(View view){
        Intent intent = new Intent(Lession_Lab5_Bai4.this, Lab5_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}