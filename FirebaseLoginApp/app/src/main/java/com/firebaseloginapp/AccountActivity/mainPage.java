package com.firebaseloginapp.AccountActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.firebaseloginapp.R;

public class mainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }



   /* btnPanic.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            String message = "My current location is:" + "\t" + currentLocation ;

            String phoneNo = editContacts.getText().toString();

            StringTokenizer st=new StringTokenizer(phoneNo,",");
            while (st.hasMoreElements())
            {
                String tempMobileNumber = (String)st.nextElement();
                if(tempMobileNumber.length()>0 && message.trim().length()>0) {
                    sendSMS(tempMobileNumber, message);
                }
                else
                {
                    Toast.makeText(getBaseContext(),
                            "Please enter both phone number and message.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        }
    });*/

}