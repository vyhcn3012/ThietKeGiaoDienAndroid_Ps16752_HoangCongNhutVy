package com.example.tkddlab1_ps16752.ASM.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tkddlab1_ps16752.ASM.Activity.KhoanThu;
import com.example.tkddlab1_ps16752.ASM.Activity.LoaiThu;
import com.example.tkddlab1_ps16752.ASM.Activity.Slide1;
import com.example.tkddlab1_ps16752.ASM.Activity.Slide2;
import com.example.tkddlab1_ps16752.ASM.Activity.Slide3;
import com.example.tkddlab1_ps16752.ASM.Activity.Slide4;

public class ThuAdapter extends FragmentStateAdapter {

    public ThuAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new LoaiThu();
            case 1:
                return new KhoanThu();
            default:
                return new KhoanThu();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
