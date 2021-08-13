package com.example.tkddlab1_ps16752.ASM.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tkddlab1_ps16752.ASM.Activity.KhoanChi;
import com.example.tkddlab1_ps16752.ASM.Activity.KhoanThu;
import com.example.tkddlab1_ps16752.ASM.Activity.LoaiChi;
import com.example.tkddlab1_ps16752.ASM.Activity.LoaiThu;

public class ChiApdater extends FragmentStateAdapter {

    public ChiApdater(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new LoaiChi();
            case 1:
                return new KhoanChi();
            default:
                return new LoaiChi();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
