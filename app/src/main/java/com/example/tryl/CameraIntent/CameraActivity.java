package com.example.tryl.CameraIntent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tryl.R;

public class CameraActivity extends AppCompatActivity {

    private static final String TAG = "CameraActivity";
    private static  final  int CameraIntent=1888;
    private Button camBtn;
    private ImageView Img;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Log.d(TAG, "onCreate: Created");
        camBtn=findViewById(R.id.openCamera);
        Img=findViewById(R.id.cam_image);

        camBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent camIntent= new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camIntent,CameraIntent);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==CameraIntent){
            Bitmap photo=(Bitmap)data.getExtras().get("data");
            Img.setImageBitmap(photo);
        }
    }
}
