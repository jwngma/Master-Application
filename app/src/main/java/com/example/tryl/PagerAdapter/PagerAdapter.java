package com.example.tryl.PagerAdapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tryl.R;

public class PagerAdapter extends android.support.v4.view.PagerAdapter {

    private Context context;

    private LayoutInflater inflater;

    public PagerAdapter(Context context) {
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    private int[] images = {
            R.drawable.add,
            R.drawable.collar,
            R.drawable.lethal,
            R.drawable.cloud,
            R.drawable.coin,
            R.drawable.coffee
    };
    private String[] tiltles = {
            " Add", " Collar", "Lethal", "Cloud", "Coin", "Coffe"
    };

    private String[] desc = {
            "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
            "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
            "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
            "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
            "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
            "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
    };

    @Override
    public int getCount() {
        return tiltles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.slider_layout, container, false);

        ImageView imageView = view.findViewById(R.id.slider_image);
        TextView textView = view.findViewById(R.id.slider_title);
        imageView.setImageResource(images[position]);
        textView.setText(tiltles[position]);
        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}