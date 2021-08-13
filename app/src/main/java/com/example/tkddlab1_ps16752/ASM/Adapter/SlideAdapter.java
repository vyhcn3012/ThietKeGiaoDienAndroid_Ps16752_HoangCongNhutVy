package com.example.tkddlab1_ps16752.ASM.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tkddlab1_ps16752.ASM.Activity.Slide1;
import com.example.tkddlab1_ps16752.ASM.Activity.Slide2;
import com.example.tkddlab1_ps16752.ASM.Activity.Slide3;
import com.example.tkddlab1_ps16752.ASM.Activity.Slide4;
import com.example.tkddlab1_ps16752.Lab6.LeftFragment;
import com.example.tkddlab1_ps16752.Lab6.RightFragment;
import com.example.tkddlab1_ps16752.Lab6.RightFragment2;

public class SlideAdapter extends FragmentStateAdapter {

    public SlideAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Slide1();
            case 1:
                return new Slide2();
            case 2:
                return new Slide3();
            case 3:
                return new Slide4();
            default:
                return new Slide1();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
