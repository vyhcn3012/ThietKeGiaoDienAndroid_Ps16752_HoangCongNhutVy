package com.example.tkddlab1_ps16752.Lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tkddlab1_ps16752.R;

import java.util.List;

public class LogoAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Logo> list;

    public LogoAdapter(Context context, int layout, List<Logo> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);

        Logo danhBa = list.get(position);

        TextView txtTen = convertView.findViewById(R.id.txtCountry);
        ImageView imgAnh = convertView.findViewById(R.id.imageViewContry);

        txtTen.setText(danhBa.getName());
        imgAnh.setImageResource(danhBa.getHinh());
        return convertView;
    }
}
