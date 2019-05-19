package com.example.tryl.recyclerView.Recyclerview_prabesh_image;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tryl.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapterr extends RecyclerView.Adapter<RecyclerViewAdapterr.ImageViewHolder> {

    private Context context;
    private int[] images;
    private List<String> list;

    public RecyclerViewAdapterr(Context context, int[] images, List<String> list) {
        this.context = context;
        this.images = images;
        this.list = list;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_layout_for_recyclerview,viewGroup,false);
        ImageViewHolder holder= new ImageViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, final int i) {
        final int image_id=images[i];

        imageViewHolder.image.setImageResource(images[i]);
       imageViewHolder.title.setText(list.get(i));

       imageViewHolder.mview.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent= new Intent(context,DisplayActivity.class);
               intent.putExtra("image",image_id);
               context.startActivity(intent);
           }
       });


    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static  class ImageViewHolder extends RecyclerView.ViewHolder{

        View mview;
        ImageView image;
        TextView title;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;


            image=mview.findViewById(R.id.imagee);
            title=mview.findViewById(R.id.textvieww);


        }
    }
}
