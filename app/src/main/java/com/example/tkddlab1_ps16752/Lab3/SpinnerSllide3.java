package com.example.tkddlab1_ps16752.Lab3;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tkddlab1_ps16752.R;

import java.util.ArrayList;


public class SpinnerSllide3 extends AppCompatActivity {

    Spinner spnLogo;
    ArrayList<Logo> arrayList;
    LogoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_sllide3);

        spnLogo = findViewById(R.id.spinner);
        arrayList = new ArrayList<>();
        arrayList.add(new Logo("VietNam", R.drawable.vietnam));
        arrayList.add(new Logo("Maylaysia", R.drawable.malay));

        adapter = new LogoAdapter(this, R.layout.item_spiner, arrayList);
        spnLogo.setAdapter(adapter);
    }
}