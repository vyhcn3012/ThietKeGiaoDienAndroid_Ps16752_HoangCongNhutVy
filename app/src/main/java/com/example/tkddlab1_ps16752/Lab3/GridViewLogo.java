package com.example.tkddlab1_ps16752.Lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.tkddlab1_ps16752.R;

import java.util.ArrayList;

public class GridViewLogo extends AppCompatActivity {

    GridView gridViewLogo;
    ArrayList<Logo> arrayList;
    GridViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridViewLogo = findViewById(R.id.gridviewLogo);
        arrayList = new ArrayList<>();
        arrayList.add(new Logo("VietNam", R.drawable.vietnam));
        arrayList.add(new Logo("Maylaysia", R.drawable.malay));

        adapter = new GridViewAdapter(this, R.layout.iteam_gridview, arrayList);
        gridViewLogo.setAdapter(adapter);

    }
}