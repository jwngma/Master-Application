package com.example.tryl.FloatingContextualMenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tryl.R;

import java.util.ArrayList;

public class FloatingContextualMenuActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countries;
    private ArrayAdapter<String> adapter;

    ArrayList<String> arrayList=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_contextual_menu);

        listView=findViewById(R.id.listview);
        registerForContextMenu(listView);
        countries=getResources().getStringArray(R.array.countries_name);

        for (String item:countries){

            arrayList.add(item);
        }
        adapter= new ArrayAdapter<String>(getApplicationContext(),R.layout.floating_conteual_menu_custom_layout,R.id.country_name,arrayList);
        listView.setAdapter(adapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.floating_contextual_menu,menu);
}

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.delete:
                arrayList.remove(info.position);
                adapter.notifyDataSetChanged();
                return  true;
            case R.id.share:
                default:
                    return super.onContextItemSelected(item);
        }
    }
}
