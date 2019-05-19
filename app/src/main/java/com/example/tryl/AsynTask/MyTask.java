package com.example.tryl.AsynTask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;

public class MyTask extends AsyncTask<Void,Integer,String> {


    Context context;
    TextView textView;
    Button button;
    ProgressDialog progressDialog;

    public MyTask(Context context, TextView textView, Button button ) {
        this.context = context;
        this.textView = textView;
        this.button = button;
    }

    @Override
    protected void onPreExecute() {
        progressDialog =new ProgressDialog(context);
        progressDialog.setTitle("Download in progress");
        progressDialog.setMax(10);
        progressDialog.setProgress(0);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();

    }

    @Override
    protected String doInBackground(Void... voids) {
        int i=0;
        synchronized (this){
            while (i<10){
                try {
                    wait(1000);
                    i++;
                    publishProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return "Download is complete";
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

        int progress=values[0];
        progressDialog.setProgress(progress);
        textView.setText("Download in Progress");
    }

    @Override
    protected void onPostExecute(String s) {

        L.s(context,s);
    }
}
