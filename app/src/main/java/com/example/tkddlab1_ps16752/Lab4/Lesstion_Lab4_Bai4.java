package com.example.tkddlab1_ps16752.Lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.Lab2.Lab2_Bai4;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai4;
import com.example.tkddlab1_ps16752.R;

public class Lesstion_Lab4_Bai4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesstion_lab4_bai4);
    }

    public void openLab4Bai4(View view){
        Intent intent = new Intent(Lesstion_Lab4_Bai4.this, Lab4_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}