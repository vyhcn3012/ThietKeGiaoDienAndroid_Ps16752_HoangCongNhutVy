package com.example.tkddlab1_ps16752.ASM.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.tkddlab1_ps16752.ASM.DAO.ILoaiThu;
import com.example.tkddlab1_ps16752.ASM.Model.LoaiThu;

import org.jetbrains.annotations.NotNull;

@Database(entities = {LoaiThu.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ILoaiThu iLoaiThu();

    public static AppDatabase INSTANCE;
    private static RoomDatabase.Callback callback = new Callback() {
        @Override
        public void onCreate(@NonNull @NotNull SupportSQLiteDatabase db) {
            super.onOpen(db);

            new PopulateDatabase(INSTANCE).execute();
        }
    };

    public static AppDatabase getDatabase(final Context context) {
        if(INSTANCE == null){
            synchronized (AppDatabase.class){
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "personal.db")
                        .fallbackToDestructiveMigration()
                        .addCallback(callback)
                        .build();
                }
            }
        return INSTANCE;
    }
    public static class PopulateDatabase extends AsyncTask<Void, Void, Void> {
        private ILoaiThu iLoaiThu;

        public PopulateDatabase(AppDatabase db) {
            iLoaiThu = db.iLoaiThu();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            String[] loaithus = new String[]{"Luong", "Thuong", "Co phieu"};
            for(String it: loaithus){
                LoaiThu lt = new LoaiThu();
                lt.ten = it;
                iLoaiThu.insert(lt);
            }
            return null;
        }
    }
}

