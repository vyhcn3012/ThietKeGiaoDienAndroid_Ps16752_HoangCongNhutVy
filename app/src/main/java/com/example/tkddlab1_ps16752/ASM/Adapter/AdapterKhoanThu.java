package com.example.tkddlab1_ps16752.ASM.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tkddlab1_ps16752.ASM.Model.KhoaThu;
import com.example.tkddlab1_ps16752.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterKhoanThu extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<KhoaThu> produstsArrayList;

    public AdapterKhoanThu(Context context, int layout, ArrayList<KhoaThu> foodsList) {
        this.context = context;
        this.layout = layout;
        this.produstsArrayList = foodsList;
    }

    @Override
    public int getCount() {
        return produstsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return produstsArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView txtName, txtPrice;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.txtName = (TextView) row.findViewById(R.id.name);
            holder.txtPrice = (TextView) row.findViewById(R.id.price);
            holder.imageView = (ImageView) row.findViewById(R.id.imageHinhAnh);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        KhoaThu produsts = produstsArrayList.get(position);

        holder.txtName.setText(produsts.getName());
        holder.txtPrice.setText(produsts.getPrice());

        byte[] foodImage = produsts.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(foodImage, 0, foodImage.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
