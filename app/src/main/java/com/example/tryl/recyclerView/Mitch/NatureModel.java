package com.example.tryl.recyclerView.Mitch;

import com.example.tryl.R;

import java.util.ArrayList;
import java.util.List;

public class NatureModel {

    private int images;
    private String title;

    public NatureModel() {
    }

    public NatureModel(int images, String title) {
        this.images = images;
        this.title = title;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static List<NatureModel> getObjectList(){

        List<NatureModel>dataList=new ArrayList<>();

        int[] images=getimages();

        for (int i=0;i<images.length;i++){

            NatureModel nature= new NatureModel();
            nature.setImages(images[i]);
            nature.setTitle("Picture"+i);
            dataList.add(nature);

        }
        return dataList;
    }

    private static int[] getimages(){
        int[] images={R.drawable.bathroom,
                R.drawable.bin,
                R.drawable.compu,
                R.drawable.copy,
                R.drawable.cycle,
                R.drawable.lethal,
                R.drawable.onion,
                R.drawable.pendrive,
                R.drawable.sunny,
                R.drawable.teamwork,
                R.drawable.timer
        };
        return images;


    }
}