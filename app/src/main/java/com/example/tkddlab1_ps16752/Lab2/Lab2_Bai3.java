package com.example.tkddlab1_ps16752.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ToggleButton;

import com.example.tkddlab1_ps16752.Lab1.Lab1_Bai3;
import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_bai4;
import com.example.tkddlab1_ps16752.R;

public class Lab2_Bai3 extends AppCompatActivity {

    ToggleButton tbtn;
    Button btnUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai3);

        tbtn = findViewById(R.id.ToggleButton);
    }

    public void btnUp(View view){
        ViewGroup.LayoutParams params = tbtn.getLayoutParams();
        params.width = 400;
        params.height = 400;

        tbtn.setLayoutParams(params);
    }

    public void bai4Lab2Lesson(View view){
        Intent intent = new Intent(Lab2_Bai3.this, Lession_Lab2_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}