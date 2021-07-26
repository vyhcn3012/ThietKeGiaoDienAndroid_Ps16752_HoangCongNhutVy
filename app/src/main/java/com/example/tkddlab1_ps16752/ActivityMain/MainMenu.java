package com.example.tkddlab1_ps16752.ActivityMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tkddlab1_ps16752.R;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void openCaseLab(View view) {
        Intent intent = new Intent(MainMenu.this, Caselab.class);
        startActivity(intent);
    }
}
