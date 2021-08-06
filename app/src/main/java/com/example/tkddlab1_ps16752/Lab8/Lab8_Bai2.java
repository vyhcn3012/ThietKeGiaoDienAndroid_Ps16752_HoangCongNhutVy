package com.example.tkddlab1_ps16752.Lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tkddlab1_ps16752.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Lab8_Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab8_bai2);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Avengers","2019 film",R.drawable.avenger),
                new MyMovieData("Venom","2018 film",R.drawable.venom),
                new MyMovieData("Batman Begins","2005 film",R.drawable.batman),
                new MyMovieData("Jumanji","2019 film",R.drawable.jumanji),
                new MyMovieData("Good Deeds","2012 film",R.drawable.good_deeds),
                new MyMovieData("Hulk","2003 film",R.drawable.hulk),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,Lab8_Bai2.this);
        recyclerView.setAdapter(myMovieAdapter);

    }
}