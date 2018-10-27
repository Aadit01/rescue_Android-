package com.example.s522553.panic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextpolicePage(View v){
        Intent i= new Intent(this,policeActivity.class);
        startActivity(i);
    }
    public void nextHospitalPage(View v)
    {
        Intent i= new Intent(this,hospitalActivity.class);
        startActivity(i);
    }
    public void nextFirestationPage(View v)
    {
        Intent i= new Intent(this,firestationActivity.class);
        startActivity(i);
    }
    public void editMemberPage(View v)
    {
        Intent i= new Intent(this,memberActivity.class);
        startActivity(i);
    }

    public void location (View v)
    {
        Intent i= new Intent(this,LocationActivity.class);
        startActivity(i);
    }

}
