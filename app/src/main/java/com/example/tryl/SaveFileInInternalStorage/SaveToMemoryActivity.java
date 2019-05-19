package com.example.tryl.SaveFileInInternalStorage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tryl.R;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveToMemoryActivity extends AppCompatActivity {

    private static final String TAG = "SaveToMemoryActivity";
    private EditText edt;
    private Button saveBtn, readBtn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_to_memory);

        edt = findViewById(R.id.edit_text);
        saveBtn = findViewById(R.id.save_fileBtn);
        readBtn = findViewById(R.id.read_fileBtn);
        result = findViewById(R.id.read_file_text);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = edt.getText().toString();
                String file_name = "hello_file";


                try {
                    FileOutputStream fileOutputStream = openFileOutput(file_name, MODE_PRIVATE);
                    fileOutputStream.write(message.getBytes());
                    fileOutputStream.close();
                    Toast.makeText(SaveToMemoryActivity.this, "Data has been saved to the memory", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message;
                try {
                    FileInputStream fileInputStream = openFileInput("hello_file");
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuffer stringBuffer = new StringBuffer();

                    while ((message = bufferedReader.readLine()) != null) {
                        stringBuffer.append(message + "\n");
                    }
                    result.setText(stringBuffer.toString());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
