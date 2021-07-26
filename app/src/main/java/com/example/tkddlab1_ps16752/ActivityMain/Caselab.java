package com.example.tkddlab1_ps16752.ActivityMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab1.MainLab1;
import com.example.tkddlab1_ps16752.Lab2.MainLab2;
import com.example.tkddlab1_ps16752.Lab3.MainLab3;
import com.example.tkddlab1_ps16752.Lab4.MainLab4;
import com.example.tkddlab1_ps16752.Lab5.MainLab5;
import com.example.tkddlab1_ps16752.Lab6.MainLab6;
import com.example.tkddlab1_ps16752.Lab7.MainLab7;
import com.example.tkddlab1_ps16752.Lab8.MainLab8;
import com.example.tkddlab1_ps16752.R;

public class Caselab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caselab);
    }

    public void openLab1(View view){
        Intent intent = new Intent(Caselab.this, MainLab1.class);
        startActivity(intent);
    }

    public void openLab2(View view){
        Intent intent = new Intent(Caselab.this, MainLab2.class);
        startActivity(intent);
    }

    public void openLab3(View view){
        Intent intent = new Intent(Caselab.this, MainLab3.class);
        startActivity(intent);
    }

    public void openLab4(View view){
        Intent intent = new Intent(Caselab.this, MainLab4.class);
        startActivity(intent);
    }

    public void openLab5(View view){
        Intent intent = new Intent(Caselab.this, MainLab5.class);
        startActivity(intent);
    }

    public void openLab6(View view){
        Intent intent = new Intent(Caselab.this, MainLab6.class);
        startActivity(intent);
    }

    public void openLab7(View view){
        Intent intent = new Intent(Caselab.this, MainLab7.class);
        startActivity(intent);
    }

    public void openLab8(View view){
        Intent intent = new Intent(Caselab.this, MainLab8.class);
        startActivity(intent);
    }

}