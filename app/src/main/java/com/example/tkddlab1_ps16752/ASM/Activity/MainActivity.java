package com.example.tkddlab1_ps16752.ASM.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.ASM.Adapter.SlideAdapter;
import com.example.tkddlab1_ps16752.ASM.Adapter.ThuAdapter;
import com.example.tkddlab1_ps16752.Lab8.Lab8_Bai1;
import com.example.tkddlab1_ps16752.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    ViewPager2 vp2;
    TextView tvb3;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case  R.id.nav_home:

                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case  R.id.nav_drawer1:
                        Intent intent2 = new Intent(MainActivity.this, ChiActivity.class);
                        startActivity(intent2);
                        break;
                    case  R.id.nav_drawer2:
                        Intent intent3 = new Intent(MainActivity.this, ThongKe.class);
                        startActivity(intent3);
                        break;
                }
                return false;
            }
        });

        vp2 = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabLayout);

        FragmentManager fManager = getSupportFragmentManager();
        ThuAdapter adapter = new ThuAdapter(fManager, getLifecycle());
        vp2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Lo???i Thu"));
        tabLayout.addTab(tabLayout.newTab().setText("Kho???n Thu"));

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
    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }
}
