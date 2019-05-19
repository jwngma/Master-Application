package com.example.tryl.AllOthers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tryl.R;

import java.util.ArrayList;

public class RadioActivity extends AppCompatActivity {
    TextView tv2;
    TextView tv, tv3;
    ArrayList<String> selection=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);

    }
    public void radioButton(View view) {

        boolean checked=((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.radio1:
                if (checked){
                   tv2.setText("one");
                }
               break;
            case R.id.radio2:
                if (checked){
                    tv2.setText("two");
                }
                break;
            case R.id.radio3:
                if (checked){
                    tv2.setText("three");
                }
                break;
        }
    }



    public void checkBox(View view) {

        boolean checked=((CheckBox)view).isChecked();

        switch (view.getId()){
            case R.id.checkbox1:
                if (checked){
                    selection.add("checkBox 1");
                }
                else {
                    selection.remove("checkBox 1");
                }
                break;
            case R.id.checkbox2:
                if (checked){
                    selection.add("checkBox 2");
                }
                else {
                    // selection.remove("checkBox 2");
                    selection.remove("checkBox 2");
                }
                break;
            case R.id.checkbox3:
                if (checked){
                    selection.add("checkBox 3");
                }
                else {
                    selection.remove("checkBox 3");
                }
                break;
            case R.id.checkbox4:
                if (checked){
                    selection.add("checkBox 4");
                }
                else {
                    selection.remove("checkBox 4");
                }
                break;
        }
    }

    public void Button(View view) {
        String final_selected_list="";

        for (String selections:selection){
            final_selected_list=final_selected_list+selections+"";


        }
        tv3.setText(final_selected_list);
        Toast.makeText(this, ""+final_selected_list, Toast.LENGTH_SHORT).show();


    }
}
