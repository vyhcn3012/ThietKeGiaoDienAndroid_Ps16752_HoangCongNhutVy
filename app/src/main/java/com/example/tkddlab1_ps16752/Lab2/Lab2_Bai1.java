package com.example.tkddlab1_ps16752.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tkddlab1_ps16752.Lab1.Lab1_Bai1;
import com.example.tkddlab1_ps16752.Lab1.Lession_Lab1_Bai2;
import com.example.tkddlab1_ps16752.R;

public class Lab2_Bai1 extends AppCompatActivity {

    TextView txtFPloy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai1);

        txtFPloy = findViewById(R.id.txtFont);
        Typeface font = Typeface.createFromAsset(getAssets(), "bblazed.ttf");
        txtFPloy.setTypeface(font);

    }

    public void bai2Lab2Lesson(View view){
        Intent intent = new Intent(Lab2_Bai1.this, Lession_Lab2_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}