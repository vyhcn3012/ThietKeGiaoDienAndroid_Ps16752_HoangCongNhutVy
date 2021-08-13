package com.example.tkddlab1_ps16752.ASM.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.tkddlab1_ps16752.ASM.DAO.ILoaiThu;
import com.example.tkddlab1_ps16752.ASM.Database.AppDatabase;
import com.example.tkddlab1_ps16752.ASM.Model.LoaiThu;

import java.util.List;

public class LoaiThuRepository {
    private ILoaiThu mILoaiThu;
    private LiveData<List<LoaiThu>> mAllLoaiThu;

    public LoaiThuRepository(Application application) {
        this.mILoaiThu = AppDatabase.getDatabase(application).iLoaiThu();
        mAllLoaiThu = mILoaiThu.findAll();
    }

    public LiveData<List<LoaiThu>> getAllLoaiThu(){
        return mAllLoaiThu;
    }

    public void insert(LoaiThu loaiThu){
        new InsertAsyncTask(mILoaiThu).execute(loaiThu);
    }

    class InsertAsyncTask extends AsyncTask<LoaiThu, Void, Void> {
        private ILoaiThu mILoaiThu;
        public InsertAsyncTask(ILoaiThu iLoaiThu){
            this.mILoaiThu = iLoaiThu;
        }

        @Override
        protected Void doInBackground(LoaiThu... loaiThus) {
            mILoaiThu.insert(loaiThus[0]);
            return null;
        }
    }
}
