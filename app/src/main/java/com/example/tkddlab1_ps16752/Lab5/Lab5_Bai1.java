package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.Lab2.Lab2_Bai1;
import com.example.tkddlab1_ps16752.Lab2.Lession_Lab2_Bai2;
import com.example.tkddlab1_ps16752.R;

import java.util.Calendar;

public class Lab5_Bai1 extends AppCompatActivity {

    Button btnDataPicker, btnTimePicker;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5_bai1);

        AnhXa();

        btnDataPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calendar = Calendar.getInstance();

                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(Lab5_Bai1.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String text = "Hôm nay là: " + dayOfMonth + "/" + (month+1) + "/" + year;
                        tv2.setText(text);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR);
                int minute = calendar.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(Lab5_Bai1.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String text = "Bây giờ là: " + hourOfDay + ":" + minute;
                        tv2.setText(text);
                    }
                }, minute, hour, true);
                timePickerDialog.show();
            }
        });
    }

    public void AnhXa() {
        btnDataPicker = findViewById(R.id.date_picker_actions);
        btnTimePicker = findViewById(R.id.timpickers);
        tv2 = findViewById(R.id.txtLs);
    }

    public void bai2Lab5Lesson(View view){
        Intent intent = new Intent(Lab5_Bai1.this, Lession_Lab5_Bai2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}