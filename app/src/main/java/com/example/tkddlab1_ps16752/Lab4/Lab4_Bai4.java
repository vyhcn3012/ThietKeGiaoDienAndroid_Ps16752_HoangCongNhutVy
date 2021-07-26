package com.example.tkddlab1_ps16752.Lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.R;

public class Lab4_Bai4 extends AppCompatActivity {

    TextView tv2;
    String[] monHoc = {"Java", "PHP", "Android", "CSS", "HTML", "C#", "C++", "Python", "JavaScript"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_bai4);

        tv2 = findViewById(R.id.txtLs);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Lab4_Bai4.this, android.R.layout.simple_list_item_1, monHoc);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);

        Toolbar toolbar = (Toolbar) findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setLogo(R.drawable.lab1_3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.bottom_navigation,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.nav_home){
            Intent intent = new Intent(Lab4_Bai4.this, MenuLab4.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int index = adapterContextMenuInfo.position;
        if(item.getItemId() == R.id.nav_view){
            String txt = "View " + monHoc[index];
            tv2.setText(txt);
        }else if(item.getItemId() == R.id.nav_delete){
            String txt = "Delete " + monHoc[index];
            tv2.setText(txt);
        }else if(item.getItemId() == R.id.nav_save){
            String txt = "Save " + monHoc[index];
            tv2.setText(txt);
        }else if(item.getItemId() == R.id.nav_edit){
            String txt = "Edit " + monHoc[index];
            tv2.setText(txt);
        }
        return super.onContextItemSelected(item);
    }

    public void bai5Lab4Lesson(View view){
        Intent intent = new Intent(Lab4_Bai4.this, Lession_Lab4_Bai5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}