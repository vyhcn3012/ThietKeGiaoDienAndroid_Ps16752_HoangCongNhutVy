package com.example.tkddlab1_ps16752.Lab7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.Lab6.Lab6_Bai1;
import com.example.tkddlab1_ps16752.Lab6.Lession_Lab6_Bai2;
import com.example.tkddlab1_ps16752.R;
import com.google.android.material.snackbar.Snackbar;

public class Lab7_Bai1 extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    ImageView btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7_bai1);

        coordinatorLayout = findViewById(R.id.coordinator_layout);
        btnOk = findViewById(R.id.btn_Ok);
        btnOk.setOnClickListener(View -> {
            Snackbar.make(coordinatorLayout, "This is  a snackbar", Snackbar.LENGTH_INDEFINITE)
                    .setTextColor(Color.RED)
                    .setBackgroundTint(Color.YELLOW)
                    .setAction("Creat Toast", new View.OnClickListener() {
                        @Override
                        public void onClick(android.view.View v) {
                            Toast.makeText(Lab7_Bai1.this, "This is Toast", Toast.LENGTH_SHORT).show();
                        }
                    }).setActionTextColor(Color.BLACK)
                    .show();
        });
    }

    public void bai2Lab7Lesson(View view){
        Intent intent = new Intent(Lab7_Bai1.this, Lession_Lab7_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}