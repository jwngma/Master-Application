package com.example.tryl.MenuWithRadioButton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.tryl.R;

public class MenuWithRadioButtonActivity extends AppCompatActivity {

    private int selection=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_with_radio_button);
    }

    public void radio_popup(View view) {

        registerForContextMenu(view);
        openContextMenu(view);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.radio_menu_network,menu);

        MenuItem data=menu.findItem(R.id.mobile_data);
        MenuItem wifi=menu.findItem(R.id.wifi_network);
        MenuItem bluetooth=menu.findItem(R.id.bluetooth);

        if (selection==1){
            data.setChecked(true);
        }
        else if(selection==2){
            wifi.setChecked(true);
        }
        else if (selection==3){
            bluetooth.setChecked(true);
        }


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mobile_data:
                Toast.makeText(this, "Mobile Data", Toast.LENGTH_SHORT).show();
                 item.setChecked(true);
                 selection=1;
                break;
            case R.id.wifi_network:
                Toast.makeText(this, "Wifi ", Toast.LENGTH_SHORT).show();
                item.setChecked(true);
                selection=2;
                break;
            case R.id.bluetooth:
                Toast.makeText(this, "Bluetooth", Toast.LENGTH_SHORT).show();
                item.setChecked(true);
                selection=3;
                break;
        }
        return true;
    }

}
