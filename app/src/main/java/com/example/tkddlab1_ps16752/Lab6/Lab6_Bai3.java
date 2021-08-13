package com.example.tkddlab1_ps16752.Lab6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tkddlab1_ps16752.ASM.Activity.DangKy;
import com.example.tkddlab1_ps16752.ASM.Activity.SlideShow;
import com.example.tkddlab1_ps16752.ASM.Adapter.SlideAdapter;
import com.example.tkddlab1_ps16752.Lab5.Lab5_Bai4;
import com.example.tkddlab1_ps16752.Lab5.MenulLab5;
import com.example.tkddlab1_ps16752.R;
import com.google.android.material.tabs.TabLayout;

public class Lab6_Bai3 extends AppCompatActivity {

    ViewPager2 vp2;
    TextView tvb3;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6_bai3);
        vp2 = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabLayout);

        FragmentManager fManager = getSupportFragmentManager();
        SlideAdapter adapter = new SlideAdapter(fManager, getLifecycle());
        vp2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("RightFrag"));
        tabLayout.addTab(tabLayout.newTab().setText("RightFrag2"));
        tabLayout.addTab(tabLayout.newTab().setText("LeftFrag"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }

    public void openMenu6(View view){
        Intent intent = new Intent(Lab6_Bai3.this, MenuLab6.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }

    public void openDangky(View v){
        Intent intent = new Intent(Lab6_Bai3.this, DangKy.class);
        startActivity(intent);
    }
}