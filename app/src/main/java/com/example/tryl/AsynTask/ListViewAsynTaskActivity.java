package com.example.tryl.AsynTask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tryl.R;

import java.util.ArrayList;

public class ListViewAsynTaskActivity extends AppCompatActivity {

    private ListView listView;

    private String[] names={"as","asd","jdvjsg","djhkfh","ljdfhkjh","jdsfhke","lkdfhkg","kdfkhr","dljfhkegr","dlkjfhkvgr","kldfhkegrj"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_asyn_task);

        listView=findViewById(R.id.listview_asyn);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
        new MyTask().execute();

    }

    class MyTask extends AsyncTask<Void,String,String>{


        ArrayAdapter<String> adapter;

        @Override
        protected void onPreExecute() {
            adapter= (ArrayAdapter)listView.getAdapter();


        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String name:names){
                publishProgress(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "All the list has been added";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            adapter.add(values[0]);
        }

        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(ListViewAsynTaskActivity.this, result, Toast.LENGTH_SHORT).show();

        }
    }
}
