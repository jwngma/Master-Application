package com.example.tryl.Recyclerview_Package;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tryl.R;

public class RecyclerviewAdapter  extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    private String[]data;

    public RecyclerviewAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

//        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
//        View view=inflater.inflate(R.layout.recyclerview_single_layout_style,viewGroup,false);

        View view=LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.recyclerview_single_layout_style,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String title=data[i];
        viewHolder.rec_title.setText(title);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView rec_image;
        private TextView rec_title;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rec_image=itemView.findViewById(R.id.rec_image);
            rec_title=itemView.findViewById(R.id.rec_title);
        }
    }
}
