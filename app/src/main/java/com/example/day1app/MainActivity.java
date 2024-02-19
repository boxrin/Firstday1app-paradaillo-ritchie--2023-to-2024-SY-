package com.example.day1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView name;
TextView cellno;
TextView email;
TextView display;
Button buttonhigh;
Button buttonlow;
TextView section;
EditText RepoName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int birthyear = 2004;
        int grade = 12;


        name = (TextView) findViewById(R.id.txtName);
        cellno = (TextView) findViewById(R.id.txtNum);
        email = (TextView) findViewById(R.id.txtEmail);
        display = (TextView) findViewById(R.id.txtDisplay);
        buttonhigh = (Button) findViewById(R.id.btnClick);
        buttonlow = (Button) findViewById(R.id.btnClear);
        section = (TextView) findViewById(R.id.txtSection);
        RepoName = (EditText) findViewById(R.id.Inputname);

        buttonhigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String RepoNameValue = RepoName.getText().toString();
                display.setText("Hello \n"+RepoNameValue+"!");


            }
        });
        buttonlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("empty....");


            }
        });

    }
}

