package com.example.tryl.AsynTask_Second;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tryl.R;

import java.util.ArrayList;

public class AsynActivity extends AppCompatActivity {
    private ListView listView;
    private String [] texts={"array1","array2","array3",
            "array4","array5","array6","array7","array8",
            "arra9","array10","array11","array12","array13",
            "array14","array15","array16","array16","array17"
            ,"array2","array3",
            "array4","array5","array6","array7","array8",
            "arra9","array10","array11","array12","array13",
            "array14","array15","array16","array16","array17","array2","array3",
            "array4","array5","array6","array7","array8",
            "arra9","array10","array11","array12","array13",
            "array14","array15","array16","array16","array17"
            ,"array2","array3",
            "array4","array5","array6","array7","array8",
            "arra9","array10","array11","array12","array13",
            "array14","array15","array16","array16","array17"
            ,"array2","array3",
            "array4","array5","array6","array7","array8",
            "arra9","array10","array11","array12","array13",
            "array14","array15","array16","array16","array17"
            ,"array2","array3",
            "array4","array5","array6","array7","array8",
            "arra9","array10","array11","array12","array13",
            "array14","array15","array16","array16","array17"
            ,"array2","array3",
            "array4","array5","array6","array7","array8",
            "arra9","array10","array11","array12","array13",
            "array14","array15","array16","array16","array17"
    };
    private Toolbar mt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asyn);
        mt=findViewById(R.id.t);
        setSupportActionBar(mt);

        if (Build.VERSION.SDK_INT>19){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }



        listView=findViewById(R.id.list_view);

        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
        new MyTask().execute();
    }

    public class MyTask extends AsyncTask<Void,String,String>{

        private ArrayAdapter<String> adapter;
        private int count=0;



        @Override
        protected void onPreExecute() {
//

            adapter = (ArrayAdapter) listView.getAdapter();
        }

        @Override
        protected String doInBackground(Void... voids) {

           for (String items:texts){

               publishProgress(items);
               try {
                   Thread.sleep(200);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           return "all list has been added";

        }

        @Override
        protected void onProgressUpdate(String... values) {
            adapter.add(values[0]);
            count++;

          //progressDialog.setProgress((int)(((double)count/texts.length)*1000));
        }

        @Override
        protected void onPostExecute(String result) {

            ToastMessage.ShowMessage(getApplicationContext(),"added");

        }
    }
}
