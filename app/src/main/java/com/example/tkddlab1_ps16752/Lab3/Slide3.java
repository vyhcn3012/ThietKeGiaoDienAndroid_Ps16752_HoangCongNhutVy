package com.example.tkddlab1_ps16752.Lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.tkddlab1_ps16752.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Slide3 extends AppCompatActivity {

    ListView lvsl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);

        lvsl3 = findViewById(R.id.listviewSlide3);
        List<HashMap<String, Object>> ds = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> hp = new HashMap<String, Object>();
        hp.put("ten", "Nhut Vy");
        hp.put("hinh", R.drawable.vy);
        hp.put("tuoi", "18");
        ds.add(hp);

        String []from = {"ten", "tuoi", "hinh"};
        int []to = {R.id.txtHoTen, R.id.txtTuoi, R.id.imageView};
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, ds, R.layout.item_listview, from, to);
        lvsl3.setAdapter(simpleAdapter);

    }
}