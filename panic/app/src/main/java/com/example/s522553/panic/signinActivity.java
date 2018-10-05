package com.example.s522553.panic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void nextPage(View v){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void cancel (View v){
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

    }
}
