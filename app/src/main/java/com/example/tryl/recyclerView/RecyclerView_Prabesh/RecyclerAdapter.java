package com.example.tryl.recyclerView.RecyclerView_Prabesh;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tryl.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<String> list;

    public RecyclerAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_single_layoutt, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.CountryName.setText(list.get(i));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        View mview;

        TextView CountryName;

        public MyViewHolder(View itemView) {
            super(itemView);
            mview = itemView;

            CountryName = mview.findViewById(R.id.tv);


        }
    }

}
