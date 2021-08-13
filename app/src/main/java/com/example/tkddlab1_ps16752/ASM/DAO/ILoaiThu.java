package com.example.tkddlab1_ps16752.ASM.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.tkddlab1_ps16752.ASM.Model.LoaiThu;

import java.util.List;

@Dao
public interface ILoaiThu {
    @Query("SELECT * FROM loaithu")
    LiveData<List<LoaiThu>> findAll();

    @Insert
    void insert(LoaiThu loaithu);

    @Update
    void update(LoaiThu loaithu);
}
