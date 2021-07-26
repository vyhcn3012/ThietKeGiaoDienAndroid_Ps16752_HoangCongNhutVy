package com.example.tkddlab1_ps16752.Lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tkddlab1_ps16752.R;

public class Bai4 extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter bai4adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] programNameList = {"Viet Nam, Malaysia"};

    int[] images = {R.drawable.vietnam, R.drawable.malay};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        bai4adapter = new Bai4Adapter(this, programNameList, images);
        recyclerView.setAdapter(bai4adapter);
    }
}