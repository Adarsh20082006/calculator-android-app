package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText e1,e2;
     TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.txt1);
        e2=findViewById(R.id.txt2);
        t1=findViewById(R.id.ans);

    }

//    int a1=Integer.parseInt(e1.getText().toString());
//    int a2=Integer.parseInt(e2.getText().toString());
    public  void add(View view){

        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());

        int sum=a1+a2;
        t1.setText(""+sum);
    }

    public  void sub(View view){
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int diff=a1-a2;
        t1.setText(""+diff);
    }

    public  void mul(View view){
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int pro=a1*a2;
        t1.setText(""+pro);
    }

    public  void div(View view){
        float a1=Integer.parseInt(e1.getText().toString());
        float a2=Integer.parseInt(e2.getText().toString());
        float division=a1/a2;
        t1.setText(""+division);
    }

}