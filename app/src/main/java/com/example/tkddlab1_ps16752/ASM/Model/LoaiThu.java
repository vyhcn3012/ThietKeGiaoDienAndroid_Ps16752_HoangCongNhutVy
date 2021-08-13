package com.example.tkddlab1_ps16752.ASM.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity

public class LoaiThu {
    @PrimaryKey(autoGenerate = true)
    public int lid;
    @ColumnInfo(name = "ten")
    public String ten;
}
