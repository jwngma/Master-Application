package com.example.tryl.recyclerView.Mitch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tryl.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<NatureModel>objectList;
    private LayoutInflater inflater;

    public MyAdapter(Context context,List<NatureModel> objectList) {
        inflater=LayoutInflater.from(context);
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view= inflater.inflate(R.layout.list_item,viewGroup,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        NatureModel current=objectList.get(position);
        myViewHolder.setData(current,position);

    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView title;
        private ImageView imgThumb,imgDelete,imgCopy;
        private int position;
        private NatureModel currentObject;

        public MyViewHolder( View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.list_title);
            imgThumb=itemView.findViewById(R.id.list_image);
            imgDelete=itemView.findViewById(R.id.list_delete);
            imgCopy=itemView.findViewById(R.id.list_copy);
        }

        public void setData(NatureModel current, int position) {
            this.title.setText(currentObject.getTitle());
            this.imgThumb.setImageResource(currentObject.getImages());
            this.position=position;
            this.currentObject=currentObject;
        }
    }
}
