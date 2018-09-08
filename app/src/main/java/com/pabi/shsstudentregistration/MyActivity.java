package com.pabi.shsstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


    }
    public void onClick(View view){
        Toast toast = makeText(this, "The Record has been submitted!", Toast.LENGTH_LONG);
        toast.show();
    }
}
