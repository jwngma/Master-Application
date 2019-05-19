package com.example.tryl.CameraIntent;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tryl.R;

import java.io.File;

public class CameraIntent_AndCreateFolderActivity extends AppCompatActivity {
    private static final String TAG = "CameraIntent_AndCreateF";

    private Button cameraBtn;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_intent__and_create_folder);

        cameraBtn=findViewById(R.id.openCamera);
        img=findViewById(R.id.cam_image);

        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File file=getFile();
                Uri fileUri=Uri.fromFile(file);
                cameIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                startActivityForResult(cameIntent,123);

            }
        });
    }

    private File getFile(){

        File folder=new File("sdcard/camera_app");
        if (!folder.exists()){
            folder.mkdir();

        }

        File img_file=new File(folder,"cam_img.jpg");
        return img_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
       if (requestCode==123){
           if (resultCode==RESULT_OK){
               String path="sdcard/camera_app/cam_image.jpg";
               img.setImageDrawable(Drawable.createFromPath(path));
           }
       }
    }
}
