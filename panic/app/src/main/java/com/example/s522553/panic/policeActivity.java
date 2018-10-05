package com.example.s522553.panic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class policeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police2);
    }
    public void policemap(View v){
        Intent i= new Intent(this,policeMapsActivity.class);
        startActivity(i);
    }
    public void goBack (View v){
        finish();
    }



    }

