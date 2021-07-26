package com.example.tkddlab1_ps16752.Lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.tkddlab1_ps16752.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Bai4Adapter extends RecyclerView.Adapter<Bai4Adapter.ViewHolder>{

    private Context context;
    String[] programNameList;
    int[] images;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView rowName;
        ImageView rowImage;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            rowName = itemView.findViewById(R.id.txtCountry);
            rowImage = itemView.findViewById(R.id.imageViewContry);
        }
    }

    public Bai4Adapter(Context context, String[] programNameList, int[] images) {
        this.context = context;
        this.programNameList = programNameList;
        this.images = images;
    }

    @NonNull
    @NotNull
    @Override
    public Bai4Adapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_spiner, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Bai4Adapter.ViewHolder holder, int position) {
        holder.rowName.setText(programNameList[position]);
        holder.rowImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return programNameList.length;
    }
}
