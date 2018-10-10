package com.example.s522553.panic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class signinActivity extends AppCompatActivity {

    Button loginButton;
    ProgressBar loginProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        loginButton=findViewById(R.id.Register);
        loginProgress=findViewById(R.id.login_progress);
        loginProgress.setVisibility(View.INVISIBLE);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginProgress.setVisibility(View.VISIBLE);
                loginButton.setVisibility(View.INVISIBLE);
            }
        });
    }
    public void nextPage(View v){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
