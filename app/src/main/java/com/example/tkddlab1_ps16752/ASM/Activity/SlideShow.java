package com.example.tkddlab1_ps16752.ASM.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tkddlab1_ps16752.ASM.Adapter.SlideAdapter;
import com.example.tkddlab1_ps16752.R;
import com.google.android.material.tabs.TabLayout;

public class SlideShow extends AppCompatActivity {

    ViewPager2 vp2;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);

        FragmentManager fManager = getSupportFragmentManager();
        SlideAdapter adapter = new SlideAdapter(fManager, getLifecycle());
        vp2.setAdapter(adapter);

        vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }

}