package com.example.tkddlab1_ps16752.Lab1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.tkddlab1_ps16752.R;

public class Lab1_Bai4 extends AppCompatActivity {

    FrameLayout fl;
    int left = -100, top = 100, bottom = 400;
    int right = 600;
    boolean isDoubleCliked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai4);

        fl = findViewById(R.id.FrameLayout);
        int[] intImage = {R.drawable.labai12345, R.drawable.labai678919, R.drawable.labaijqk0};
//        for(int i = 0; i < intImage.length; i++) {
//            ImageView im = new ImageView(Lab1_Bai4.this);
//            im.setImageResource(intImage[i]);
//            left += 200;
//            right -= 10;

            int labai1 = R.drawable.labai12345;
            ImageView imageView1 = new ImageView(this);
            imageView1.setImageResource(labai1);
            imageView1.setMaxHeight(50);
            imageView1.setPadding(left, right, top, bottom);
            fl.addView(imageView1);

            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView1.setPadding(left, right, top, bottom - 20);
                }
            });

            imageView1.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    imageView1.setPadding(left, right, top, bottom);
                    return false;
                }
            });

        int labai2 = R.drawable.labai678919;
        ImageView imageView2 = new ImageView(Lab1_Bai4.this);
        imageView2.setImageResource(labai2);
        imageView2.setMaxHeight(50);
        imageView2.setPadding(left, right, 100-350, bottom);
        fl.addView(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2.setPadding(left, right - 20, 100 - 350, bottom);
            }
        });

        imageView2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView2.setPadding(left, right, 100 - 350, bottom);
                return true;
            }
        });



        int labai3 = R.drawable.labaijqk0;
        ImageView imageView3 = new ImageView(Lab1_Bai4.this);
        imageView3.setImageResource(labai3);
        imageView3.setMaxHeight(50);
        imageView3.setPadding(left, right, top - 700, bottom);
        fl.addView(imageView3);

//        imageView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                imageView3.setPadding(left, right - 20, top - 700, bottom);
//            }
//        });
//
//        imageView3.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                imageView3.setPadding(left, right, top - 700, bottom);
//                return true;
//            }
//        });




//            im.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    im.setPadding(left, right, top + 100, bottom);
//                }
//            });
        }

    public void openMenu(View view){
        Intent intent = new Intent(Lab1_Bai4.this, MenuLab1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

}