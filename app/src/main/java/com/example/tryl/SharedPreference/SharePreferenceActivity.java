package com.example.tryl.SharedPreference;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

import com.example.tryl.R;

public class SharePreferenceActivity extends AppCompatActivity {

    private EditText editText;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_preference);

        editText = findViewById(R.id.edit_text);
        seekBar = findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editText.setTextSize(TypedValue.COMPLEX_UNIT_PX, progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void save(View view) {

    }

    public void clear(View view) {
    }

    public void changeColor(View view) {

        switch (view.getId()){
            case R.id.black:
                editText.setTextColor(Color.parseColor("#000"));
                break;

            case R.id.blue:
                editText.setTextColor(Color.parseColor("#FF03A9F4"));
                break;

            case R.id.green:
                editText.setTextColor(Color.parseColor("#fff"));
                break;
        }
    }
}
