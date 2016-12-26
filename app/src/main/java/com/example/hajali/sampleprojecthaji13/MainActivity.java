package com.example.hajali.sampleprojecthaji13;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    TextView textPercent;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        progressBar.setMax(100);
        textPercent = (TextView) findViewById(R.id.text_percent);
        editText = (EditText) findViewById(R.id.edit_text);

        //reset progress bar and filesize status


    }

    public void setProgress(View view) {
        try{
        if (Integer.parseInt(editText.getText().toString()) <= 100 && Integer.parseInt(editText.getText().toString()) >= 0) {
            progressBar.setProgress(Integer.parseInt(editText.getText().toString()));
            textPercent.setText(editText.getText().toString().concat("%"));
        } else {
            editText.setText("0");
            textPercent.setText("0");
        }}catch (Exception e){
            Toast.makeText(getBaseContext(),"error",Toast.LENGTH_SHORT).show();
            editText.setText("0");
            textPercent.setText("0");
        }
    }
}

