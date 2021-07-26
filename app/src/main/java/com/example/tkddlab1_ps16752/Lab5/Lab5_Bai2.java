package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.tkddlab1_ps16752.Lab2.Lab2_Bai2;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai3;
import com.example.tkddlab1_ps16752.R;

public class Lab5_Bai2 extends AppCompatActivity {

    Button btnDownload;
    ProgressBar pbXuly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5_bai2);

        AnhX();

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = pbXuly.getProgress();
                if(current >= pbXuly.getMax()){
                    current = 0;
                }
                pbXuly.setProgress(current + 10);
            }
        });
    }

    public void bai3Lab5Lesson(View view){
        Intent intent = new Intent(Lab5_Bai2.this, Lession_Lab5_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void AnhX(){
        btnDownload = findViewById(R.id.dowload);
        pbXuly = findViewById(R.id.progressBarId);
    }
}