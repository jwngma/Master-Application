package com.example.tryl.ListView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tryl.AllOthers.MainActivity;
import com.example.tryl.R;

public class ListviewActivity extends AppCompatActivity {
    private ListView listView;
    ArrayAdapter<String> adapter;

    private String[] country_name = {
            "india",
            "pakisthan",
            "bangladesh",
            "india",
            "pakisthan",
            "bangladesh",
            "india",
            "pakisthan",
            "bangladesh",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView = findViewById(R.id.listview);
        adapter = new ArrayAdapter<String>(this, R.layout.list_view_custom_layout, R.id.list_item, country_name);
        //adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,country_name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListviewActivity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                view.setSelected(true);

                String extra = parent.getItemAtPosition(position).toString();
                Intent intent = new Intent(ListviewActivity.this, MainActivity.class);
                intent.putExtra("extra", extra);
                startActivity(intent);

            }
        });
    }
}
