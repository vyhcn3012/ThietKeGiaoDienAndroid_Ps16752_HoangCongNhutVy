package com.example.tkddlab1_ps16752.ASM.Activity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tkddlab1_ps16752.ASM.Model.LoaiThu;
import com.example.tkddlab1_ps16752.ASM.Repository.LoaiThuRepository;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LoaiThuViewModel extends AndroidViewModel {
    private LoaiThuRepository mloaiRepository;
    private LiveData<List<LoaiThu>> mAllLoaiThu;

    public LoaiThuViewModel(@NonNull @NotNull Application application) {
        super(application);
        mloaiRepository = new LoaiThuRepository(application);
        mAllLoaiThu = mloaiRepository.getAllLoaiThu();
    }

    public LiveData<List<LoaiThu>> getAllLoaiThu() {
        return mAllLoaiThu;
    }
    public void insert(LoaiThu loaiThu) {
        mloaiRepository.insert(loaiThu);
    }
}
