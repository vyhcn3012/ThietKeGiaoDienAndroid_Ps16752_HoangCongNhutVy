package com.example.tkddlab1_ps16752.Lab6;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

public class MyAdapter extends FragmentStateAdapter{

    public MyAdapter(@NonNull FragmentManager fragmentManager,@NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RightFragment2();
            case 1:
                return new RightFragment();
            case 2:
                return new LeftFragment();
            default:
                return new RightFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
