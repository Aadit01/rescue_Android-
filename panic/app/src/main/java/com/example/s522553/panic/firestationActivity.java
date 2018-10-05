package com.example.s522553.panic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class firestationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firestation);
    }
    public void goBack (View v){
        finish();
    }
}
