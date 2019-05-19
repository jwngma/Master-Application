package com.example.tryl.recyclerView.Recyclerview_prabesh_image;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;

        import com.example.tryl.R;

public class DisplayActivity extends AppCompatActivity {

    String img_url;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        imageView=findViewById(R.id.im);


        if (getIntent().hasExtra("image")) {
            //img_url =getIntent().getStringExtra("image");
            imageView.setImageResource(getIntent().getIntExtra("image",00));
        }


    }
}
