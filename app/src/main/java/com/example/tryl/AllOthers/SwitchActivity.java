package com.example.tryl.AllOthers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.tryl.R;

public class SwitchActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    TextView text_Toggle;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        toggleButton=findViewById(R.id.toggleBtn);
        text_Toggle=findViewById(R.id.tv_toggle);
        aSwitch=findViewById(R.id.switchBtn);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    text_Toggle.setText("ONNNNNNN");
                }
                else {
                    text_Toggle.setText("Offfffffffffff");
                }
            }
        });

      toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if (toggleButton.isChecked()){
                  text_Toggle.setText("ONNNNNNN");
              }
              else {
                  text_Toggle.setText("Offfffffffffff");
              }
          }
      });
    }


}
