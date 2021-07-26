package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tkddlab1_ps16752.Lab4.Lab4_Bai3;
import com.example.tkddlab1_ps16752.Lab4.Lesstion_Lab4_Bai4;
import com.example.tkddlab1_ps16752.R;

public class Lab5_Bai3 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5_bai3);

        AnhXa();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context;
                AlertDialog.Builder builder = new AlertDialog.Builder(Lab5_Bai3.this);
                builder.setMessage("Nội dung Dialog").setTitle("Tiêu đề Dialog");
                builder.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] array = {"Red", "Green", "Blue"};
                AlertDialog.Builder builder = new AlertDialog.Builder(Lab5_Bai3.this);
                builder.setTitle("Chọn màu");
                builder.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mau[] = new String[]{"Red", "Yellow", "Blue"};
                AlertDialog.Builder builder = new AlertDialog.Builder(Lab5_Bai3.this);
                builder.setTitle("Chọn màu");
                builder.setSingleChoiceItems(mau, 2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv2.setText("Ban cho: " + mau[which]);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mau[] = new String[]{"Red", "Yellow", "Blue"};
                final boolean[] check = new boolean[]{true, true, false};
                AlertDialog.Builder builder = new AlertDialog.Builder(Lab5_Bai3.this);
                builder.setTitle("Chọn màu");
                builder.setMultiChoiceItems(mau, check, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        check[which] = isChecked;
                    }
                });
                builder.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv2.setText("Các màu bạn chọn: \n");
                        for (int i = 0; i < check.length; i++){
                            boolean checked = check[i];
                            if(checked){
                                tv2.setText(tv2.getText() + mau[i] + "\n");
                            }
                        }
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }

    public void bai4Lab5Lesson(View view){
        Intent intent = new Intent(Lab5_Bai3.this, Lession_Lab5_Bai4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void AnhXa() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tv2 = findViewById(R.id.txtLs);
    }
}