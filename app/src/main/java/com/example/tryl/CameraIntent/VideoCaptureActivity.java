package com.example.tryl.CameraIntent;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tryl.R;

import java.io.File;

public class VideoCaptureActivity extends AppCompatActivity {

    private static final String TAG = "VideoCaptureActivity";
    private static  final int CAMAERA_REQUEST=1;
    private Button videoCameraBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_capture);

        videoCameraBtn=findViewById(R.id.open_camera);
        videoCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoIntent= new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                File file= getFile();
                Uri video_uri=Uri.fromFile(file);
                videoIntent.putExtra(MediaStore.EXTRA_OUTPUT,video_uri);
                videoIntent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,1);
                startActivityForResult(videoIntent,CAMAERA_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==CAMAERA_REQUEST && resultCode==RESULT_OK){
            Toast.makeText(this, "Video captured and stored", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Video capture Failed", Toast.LENGTH_SHORT).show();
        }
    }

    private File getFile() {

        File folder= new File("sdcard/video_app");
        if (!folder.exists()){
            folder.mkdir();
        }
        File video_file=new File(folder,"video_file.mp4");
        return video_file;
    }
}
